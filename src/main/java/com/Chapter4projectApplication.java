package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")

public class Chapter4projectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter4projectApplication.class, args);
	}

}
