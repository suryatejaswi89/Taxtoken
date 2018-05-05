package com.taxtoken.Taxtoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TaxtokenApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TaxtokenApplication.class, args);
	}
		
}
