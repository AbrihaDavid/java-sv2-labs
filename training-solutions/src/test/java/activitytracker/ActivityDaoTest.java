package activitytracker;

import jdbc.EmployeesDao;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    private ActivityDao activityDao;

    @BeforeEach
    void init(){
        MariaDbDataSource dataSource = new MariaDbDataSource();

        try{
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException se){
            throw new IllegalStateException("Cannot reach database",se);
        }



        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

  //      flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    void saveActivityTest() {
        Activity activity1 = new Activity(1, LocalDateTime.of(2022,02,02,8,0),"Biking trip",Activities.BIKING);
        Activity activity2 = new Activity(2, LocalDateTime.of(2022,02,02,10,0),"Hiking",Activities.HIKING);
        Activity activity3 = new Activity(3, LocalDateTime.of(2022,02,02,12,0),"Outdoor running",Activities.RUNNING);
        Activity activity4 = new Activity(4, LocalDateTime.of(2022,02,02,14,0),"Basketball game",Activities.BASKETBALL);

        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        activityDao.saveActivity(activity4);

        Activity activityResult = activityDao.findActivityById(2L);
        assertEquals("Hiking",activityResult.getDesc());

    }
}