package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Activity {

    private long id;
    private LocalDateTime startTime;
    private String desc;
    private Activities activities;
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public Activity(LocalDateTime startTime, String desc, Activities activities) {
        this.startTime = startTime;
        this.desc = desc;
        this.activities = activities;
    }

    public void addTrackPoint(TrackPoint trackPoint){
        trackPoints.add(trackPoint);
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
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
