package activitytracker;

import jdbc.EmployeesDao;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);

        Activity activity1 = new Activity(LocalDateTime.of(2022,02,02,8,0),"Biking trip",Activities.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2022,02,02,10,0),"Hiking",Activities.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2022,02,02,12,0),"Outdoor running",Activities.RUNNING);
        Activity activity4 = new Activity(LocalDateTime.of(2022,02,02,14,0),"Basketball game",Activities.BASKETBALL);

        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        activityDao.saveActivity(activity4);


    }

    @Test
    void findActivityByIdTest() {
        Activity activityResult = activityDao.findActivityById(2L);
        assertEquals("Hiking",activityResult.getDesc());

    }

    @Test
    void saveActivityWithId(){
        Activity activity5 = new Activity(LocalDateTime.of(2022,02,02,16,0),"Running",Activities.RUNNING);
        Activity result = activityDao.saveActivity(activity5);
        assertEquals(5, result.getId());
    }
}