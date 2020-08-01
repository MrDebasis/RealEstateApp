package com.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan("com.property.modules")
@EnableJpaRepositories(basePackages = "com.property.repository")
@SpringBootApplication
public class RealEstateAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealEstateAppApplication.class, args);
	}

}
