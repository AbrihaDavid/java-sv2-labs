package activitytrackerwithspring;

import activitytracker.Activities;
import activitytracker.Activity;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        activitytracker.Activity activity1 = new activitytracker.Activity(LocalDateTime.of(2022,02,02,8,0),"Biking trip", activitytracker.Activities.BIKING);
        activitytracker.Activity activity2 = new activitytracker.Activity( LocalDateTime.of(2022,02,02,10,0),"Hiking", activitytracker.Activities.HIKING);
        activitytracker.Activity activity3 = new activitytracker.Activity(LocalDateTime.of(2022,02,02,12,0),"Outdoor running", activitytracker.Activities.RUNNING);
        activitytracker.Activity activity4 = new Activity(LocalDateTime.of(2022,02,02,14,0),"Basketball game", Activities.BASKETBALL);

        MariaDbDataSource dataSource = new MariaDbDataSource();

        try{
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se){
            throw new IllegalStateException("Cannot reach database",se);
        }





    }
}
