package com.example.demo;

import com.example.demo.model.LombokPOJO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		LombokPOJO lombokPOJO = LombokPOJO.builder()
						.name("test").age(20).build();
		SpringApplication.run(DemoApplication.class, args);

	}



}
