package com.learning.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLearningApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringbootLearningApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
