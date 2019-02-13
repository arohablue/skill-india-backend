package com.skillindia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.skillindia")
public class SkillIndiaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillIndiaBackendApplication.class, args);
	}

}

