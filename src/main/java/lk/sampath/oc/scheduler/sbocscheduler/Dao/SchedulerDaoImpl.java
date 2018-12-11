package lk.sampath.oc.scheduler.sbocscheduler.Dao;

import lk.sampath.oc.scheduler.sbocscheduler.Entity.CreateScheduler;
import org.springframework.stereotype.Repository;

/**
 * Created by dulanjali on 12/8/2018.
 */
@Repository
public class SchedulerDaoImpl implements SchedulerDao {

    @Override
    public void addSchedule(CreateScheduler sch) {
        System.out.println("This is Dao : SchedulerDaoImpl");
    }
}
