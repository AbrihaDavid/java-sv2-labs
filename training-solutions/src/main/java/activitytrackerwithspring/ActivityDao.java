package activitytrackerwithspring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private JdbcTemplate jdbcTemplate;

    public ActivityDao(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public Activity saveActivity(Activity activity){
        KeyHolder holder = new GeneratedKeyHolder();

        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            ps.setString(2,activity.getDesc());
            ps.setString(3,activity.getActivities().toString());
            return ps;
        },holder);

        Activity result = findActivityById(holder.getKey().longValue());
        result.setId(holder.getKey().longValue());


        return result;
    }

    public Activity findActivityById(long id){


        return jdbcTemplate.queryForObject("select * from activities where id = ?",
                (rs,rowNum)-> new Activity(
                        rs.getTimestamp(2).toLocalDateTime(),
                        rs.getString(3),
                        Activities.valueOf(rs.getString(4))),id);
    }

    public List<Activity> listActivities(){
        return jdbcTemplate.query("select * from activities",
                (rs,rowNum)->
                    new Activity(
                            rs.getTimestamp(2).toLocalDateTime(),
                            rs.getString(3),
                            Activities.valueOf(rs.getString(4))
                ));
    }
}
