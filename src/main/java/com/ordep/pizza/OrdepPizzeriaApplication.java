package com.ordep.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class OrdepPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdepPizzeriaApplication.class, args);
	}

}
