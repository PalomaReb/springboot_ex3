package com.bosonit.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio3Application.class, args);
	}

	@Bean
	PersonService getPersonService() {
		PersonService c = new PersonService();
		List<City>cities = new ArrayList<>();
		c.setCities(cities);
		return c;
	}

}
