package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//We have to explicitly state that com.luv2code.util is part of the packages to use in component scanning (even though outside of main base package)
/*
@SpringBootApplication(
		scanBasePackages = {"com.luv2code.springcoredemo",
							"com.luv2code.util"})
*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
