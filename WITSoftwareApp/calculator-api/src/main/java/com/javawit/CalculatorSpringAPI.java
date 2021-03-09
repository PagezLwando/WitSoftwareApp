package com.javawit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.javawit.controllers"})
public class CalculatorSpringAPI {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CalculatorSpringAPI.class, args);
	}
}