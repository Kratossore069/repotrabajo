package com.bosonit.virtualtraveler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) //Esto fue necesario para arrancar
public class VirtualtravelerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualtravelerApplication.class, args);
	}

}
