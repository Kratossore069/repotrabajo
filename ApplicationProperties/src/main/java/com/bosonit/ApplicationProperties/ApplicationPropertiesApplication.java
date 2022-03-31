package com.bosonit.ApplicationProperties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ApplicationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPropertiesApplication.class, args);
	}
}
