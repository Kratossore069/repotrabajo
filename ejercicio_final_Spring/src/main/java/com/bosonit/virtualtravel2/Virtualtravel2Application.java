package com.bosonit.virtualtravel2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Virtualtravel2Application {

	public static void main(String[] args) {
		SpringApplication.run(Virtualtravel2Application.class, args);
	}
}
