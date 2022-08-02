package com.bdd.demobdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemobddApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemobddApplication.class, args);
	}

}
