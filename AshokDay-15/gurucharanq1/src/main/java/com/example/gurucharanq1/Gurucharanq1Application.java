package com.example.gurucharanq1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Gurucharanq1Application {

	public static void main(String[] args) {
		log.info("Before Starting Application");
		SpringApplication.run(Gurucharanq1Application.class, args);
	}

}
