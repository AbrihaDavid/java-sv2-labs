package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        Activity activity1 = new Activity(1, LocalDateTime.of(2022,02,02,8,0),"Biking trip",Activities.BIKING);
        Activity activity2 = new Activity(2, LocalDateTime.of(2022,02,02,10,0),"Hiking",Activities.HIKING);
        Activity activity3 = new Activity(3, LocalDateTime.of(2022,02,02,12,0),"Outdoor running",Activities.RUNNING);
        Activity activity4 = new Activity(4, LocalDateTime.of(2022,02,02,14,0),"Basketball game",Activities.BASKETBALL);



        MariaDbDataSource dataSource = new MariaDbDataSource();

        try{
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUserName("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se){
            throw new IllegalStateException("Cannot reach database",se);
        }


        activity1.addActivitiesToDatabase(dataSource);
        activity2.addActivitiesToDatabase(dataSource);
        activity3.addActivitiesToDatabase(dataSource);
        activity4.addActivitiesToDatabase(dataSource);

    }
}
