package com.workshop.challenge1112;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;



@SpringBootApplication
@EnableAutoConfiguration
@OpenAPIDefinition
@EnableWebMvc
public class Challenge1112Application {

	public static void main(String[] args) {
		SpringApplication.run(Challenge1112Application.class, args);
	}

}
