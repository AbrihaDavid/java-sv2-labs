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

    public void saveActivity(Activity activity){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values (?,?,?)")){
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2,activity.getDesc());
            stmt.setString(3,activity.getActivities().toString());
            stmt.executeUpdate();

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot query!",se);
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
                    return new Activity(rs.getInt(1),rs.getTimestamp(2).toLocalDateTime(),rs.getString(3),Activities.valueOf(rs.getString(4)));
                } else{
                    return null;
                }
            }

        } catch (SQLException se){
            throw new IllegalArgumentException("Cannot query",se);
        }
    }

    public List<Activity> createNewObjectListBasedOnDatabaseRecords(){

        try(Connection connection = dataSource.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from activities")){

            List<Activity> result = new ArrayList<>();
            while(rs.next()){
                result.add(new Activity(rs.getInt(1),rs.getTimestamp(2).toLocalDateTime(),rs.getString(3),Activities.valueOf(rs.getString(4))));
            }
            return result;

        }catch (SQLException se){
            throw new IllegalArgumentException("Cannot query",se);
        }
    }

}
