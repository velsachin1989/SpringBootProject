package com.example.GoogleCloudWithSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleCloudWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleCloudWithSpringBootApplication.class, args);
	}
	
	@RequestMapping(value="/firstApp")
	public String firstApp() {
		
		return "Hello this is GCP with springboot application*****";
	}

}
