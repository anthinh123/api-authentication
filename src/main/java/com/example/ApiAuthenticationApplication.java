package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class ApiAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAuthenticationApplication.class, args);
	}

}
