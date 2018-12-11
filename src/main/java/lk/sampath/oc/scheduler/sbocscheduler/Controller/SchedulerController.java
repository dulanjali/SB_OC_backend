package lk.sampath.oc.scheduler.sbocscheduler.Controller;

import lk.sampath.oc.scheduler.sbocscheduler.Entity.CreateScheduler;
import lk.sampath.oc.scheduler.sbocscheduler.Service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by dulanjali on 12/8/2018.
 */
@RestController
@RequestMapping("/schedulers")
public class SchedulerController {
            @Autowired
            private SchedulerService schedulerService;
//        @RequestMapping(method = RequestMethod.GET)
//        public Collection<CreateScheduler> getAllStudents(){
//            return this.studentService.getAllStudents();
//        }
//
//        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//        public Student getPaymentScheduleInfo(@PathVariable("id") int id){
//            return this.studentService.getStudentById(id);
//        }
//
//        @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//        public void deletePaymentSchedule(@PathVariable("id") int id){
//            this.studentService.deleteStudentById(id);
//        }

        @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
        public void createPaymentSchedule(@RequestBody CreateScheduler sch){
           this.schedulerService.addSchedule(sch);
            System.out.println("This is Controller : SchedulerController");
        }

//        @RequestMapping(method = RequestMethod.DELETE)
//        public ResponseEntity<?> deleteAllStudents(){
//            return this.studentService.deleteAllStudents();
//        }
//
//        @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//        public void updateStudent(@RequestBody Student s){
//            this.studentService.updateStudent(s);
//        }

}
