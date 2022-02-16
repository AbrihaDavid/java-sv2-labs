package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity saveActivity(Activity activity){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS)){
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2,activity.getDesc());
            stmt.setString(3,activity.getActivities().toString());
            stmt.executeUpdate();

            return getActivity(stmt);

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot query!",se);
        }
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
