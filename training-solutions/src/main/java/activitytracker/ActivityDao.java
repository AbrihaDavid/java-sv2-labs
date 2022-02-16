package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public Activity saveActivity(Activity activity){
        try (Connection connection = dataSource.getConnection()) {

            connection.setAutoCommit(false);

            try( PreparedStatement stmt = connection.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
                PreparedStatement stmt2 = connection.prepareStatement("insert into track_point values (?,?,?,?,?)")){

                stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                stmt.setString(2,activity.getDesc());
                stmt.setString(3,activity.getActivities().toString());
                stmt.executeUpdate();
                connection.commit();
                Activity result = getActivity(stmt);

                if(!activity.getTrackPoints().isEmpty()){
                    for(TrackPoint trackPoint: activity.getTrackPoints()){
                        if(trackPoint.getLat() > 90 || trackPoint.getLat() <-90 || trackPoint.getLon() > 180 || trackPoint.getLon() <-180){
                            throw new IllegalArgumentException("Invalid coordinate");
                        }
                        stmt2.setLong(1,trackPoint.getId());
                        stmt2.setTimestamp(2, Timestamp.valueOf(trackPoint.getTime()));
                        stmt2.setFloat(3,(float)trackPoint.getLat());
                        stmt2.setFloat(4,(float)trackPoint.getLon());
                        stmt2.setLong(5,result.getId());
                        stmt2.executeUpdate();
                    }
                }
                connection.commit();
                return result;

            } catch (IllegalArgumentException iae){
                connection.rollback();
            }
        }catch (SQLException se){
            throw new IllegalArgumentException("Cannot insert",se);
        }
        return null;
    }

    private Activity getActivity(PreparedStatement stmt) throws SQLException {
        try(
                ResultSet rs = stmt.getGeneratedKeys();
                ){

            if (rs.next()){
                Activity result = findActivityById(rs.getLong(1));
                result.setId(rs.getLong(1));
                return result;
            }
            throw new IllegalStateException("Cannot get id");
        }
    }

    public Activity findActivityById(long id){

        try(Connection connection = dataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("select * from activities where id = ?")){

            stmt.setLong(1,id);

            try(
                    ResultSet rs = stmt.executeQuery()
            ){

                if (rs.next()){
                    return new Activity(rs.getTimestamp(2).toLocalDateTime(),rs.getString(3),Activities.valueOf(rs.getString(4)));
                } else{
                    return null;
                }
            }

        } catch (SQLException se){
            throw new IllegalArgumentException("Cannot query",se);
        }
    }

    public List<Activity> listActivities(){

        try(Connection connection = dataSource.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from activities")){

            List<Activity> result = new ArrayList<>();
            while(rs.next()){
                result.add(new Activity(rs.getTimestamp(2).toLocalDateTime(),rs.getString(3),Activities.valueOf(rs.getString(4))));
            }
            return result;

        }catch (SQLException se){
            throw new IllegalArgumentException("Cannot query",se);
        }
    }

}
