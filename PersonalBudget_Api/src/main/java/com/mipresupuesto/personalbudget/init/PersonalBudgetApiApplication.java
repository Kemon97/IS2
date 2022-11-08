package com.mipresupuesto.personalbudget.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.microsoft.applicationinsights.attach.ApplicationInsights;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mipresupuesto.personalbugdet"})
@EnableJpaRepositories(basePackages = {"com.mipresupuesto.personalbugdet" })
@EntityScan(basePackages = {"com.mipresupuesto.personalbugdet" })
public class PersonalBudgetApiApplication {

	public static void main(String[] args) {
		ApplicationInsights.attach();
		SpringApplication.run(PersonalBudgetApiApplication.class, args);
	}

}
