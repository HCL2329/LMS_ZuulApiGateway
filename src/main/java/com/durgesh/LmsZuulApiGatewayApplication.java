package com.durgesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LmsZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsZuulApiGatewayApplication.class, args);
	}

}
