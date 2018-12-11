package lk.sampath.oc.scheduler.sbocscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//@ComponentScan({"lk.sampath.oc.scheduler.sbocscheduler.Controller",
//    "lk.sampath.oc.scheduler.sbocscheduler.Dao",
//"lk.sampath.oc.scheduler.sbocscheduler.Service"})
//@EntityScan("lk.sampath.oc.scheduler.sbocscheduler.Entity")
//@EnableJpaRepositories("lk.sampath.oc.scheduler.sbocscheduler.Repository")
@SpringBootApplication
public class SbocschedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbocschedulerApplication.class, args);
		System.out.println("This is Main");
	}
}
