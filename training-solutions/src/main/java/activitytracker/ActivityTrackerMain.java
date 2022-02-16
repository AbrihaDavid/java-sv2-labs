package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {
/*
    public Activity createNewObjectBasedOnId(DataSource dataSource, int id){

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

    public List<Activity> createNewObjectListBasedOnDatabaseRecords(DataSource dataSource){

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

 */

    public static void main(String[] args) {

        Activity activity1 = new Activity(LocalDateTime.of(2022,02,02,8,0),"Biking trip",Activities.BIKING);
        Activity activity2 = new Activity( LocalDateTime.of(2022,02,02,10,0),"Hiking",Activities.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2022,02,02,12,0),"Outdoor running",Activities.RUNNING);
        Activity activity4 = new Activity(LocalDateTime.of(2022,02,02,14,0),"Basketball game",Activities.BASKETBALL);



        MariaDbDataSource dataSource = new MariaDbDataSource();

        try{
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se){
            throw new IllegalStateException("Cannot reach database",se);
        }


      /*
        activity1.addActivitiesToDatabase(dataSource);
        activity2.addActivitiesToDatabase(dataSource);
        activity3.addActivitiesToDatabase(dataSource);
        activity4.addActivitiesToDatabase(dataSource);
       */


        ActivityTrackerMain activityTrackerMain = new ActivityTrackerMain();
/*
        Activity activity5 = activityTrackerMain.createNewObjectBasedOnId(dataSource,5);
        System.out.println(activity5.getDesc());



        List<Activity> activities = activityTrackerMain.createNewObjectListBasedOnDatabaseRecords(dataSource);
        System.out.println(activities.size());



 */



    }
}
