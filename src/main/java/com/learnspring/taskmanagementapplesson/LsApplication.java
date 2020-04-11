package com.learnspring.taskmanagementapplesson;

import com.learnspring.taskmanagementapplesson.persistence.model.Project;
import com.learnspring.taskmanagementapplesson.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@SpringBootApplication(scanBasePackages = "com.learnspring.taskmanagementapplesson.persistence")
public class LsApplication {

	@Autowired
	IProjectService projectService;

	public static void main(final String... args) {
		SpringApplication.run(LsApplication.class, args);
	}

	@PostConstruct
	public void postConstruct(){
		projectService.save(new Project(1L, "My First Project", LocalDate.now()));
	}

}
