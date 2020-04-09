package com.learnspring.taskmanagementapplesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.learnspring.taskmanagementapplesson.persistence")
public class LsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LsApplication.class, args);
	}

}
