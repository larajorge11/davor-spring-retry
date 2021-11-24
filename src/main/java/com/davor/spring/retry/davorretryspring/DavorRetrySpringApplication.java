package com.davor.spring.retry.davorretryspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class DavorRetrySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DavorRetrySpringApplication.class, args);
	}

}
