package com.crif.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
//1
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

//2 - it will run before my application start.
//3 - 
	@PostConstruct
	public void init() {
		logger.info("Application started..");
	}

	public static void main(String[] args) {
//4 
		logger.info("Application executed..");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
//5 go to test package