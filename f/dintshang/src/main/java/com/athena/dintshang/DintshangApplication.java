package com.athena.dintshang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@EnableDiscoveryClient
//@SpringBootApplication
@ComponentScan("com.athena.dintshang.user")
public class DintshangApplication {

	public static void main(String[] args) {
		SpringApplication.run(DintshangApplication.class, args);
	}
}
