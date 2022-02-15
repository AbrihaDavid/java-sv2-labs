package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;

public class Activity {

    private int id;
    private LocalDateTime startTime;
    private String desc;
    private Activities activities;

    public Activity(int id, LocalDateTime startTime, String desc, Activities activities) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.activities = activities;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public Activities getActivities() {
        return activities;
    }

    public void addActivitiesToDatabase(DataSource dataSource){


        try(Connection connection = dataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values (?,?,?)")){
            stmt.setTimestamp(1, Timestamp.valueOf(this.getStartTime()));
            stmt.setString(2,this.getDesc());
            stmt.setString(3,this.getActivities().toString());
            stmt.executeUpdate();

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot query!",se);
        }
    }

}
