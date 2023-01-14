package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnBuildApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnBuildApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnBuildApplication.class, args);
		LOGGER.info("Application started");
	}

}
