package lk.sampath.oc.scheduler.sbocscheduler.Service;

import lk.sampath.oc.scheduler.sbocscheduler.Entity.CreateScheduler;
import lk.sampath.oc.scheduler.sbocscheduler.Repository.SchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by dulanjali on 12/8/2018.
 */
@Service
public class SchedulerService {
    @Autowired
    private SchedulerRepository schedulerRepository;
    
//    @Bean
    public void addSchedule(CreateScheduler sch){
        // this.StudentDao.addStudent(s);
        System.out.println("This is Service : SchedulerService ");
        this.schedulerRepository.save(sch);
    }
}
