package com.devcodestack.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ApplicationCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationCloudConfigApplication.class, args);
	}

}
