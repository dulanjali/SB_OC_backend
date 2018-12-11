package lk.sampath.oc.scheduler.sbocscheduler.Repository;

import lk.sampath.oc.scheduler.sbocscheduler.Entity.CreateScheduler;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dulanjali on 12/8/2018.
 */

@Repository

public interface SchedulerRepository extends JpaRepository<CreateScheduler,Long>{
    
}
