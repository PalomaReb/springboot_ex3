package com.bosonit.ejercicio3;

import org.springframework.beans.factory.annotation.Qualifier;
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


	@Bean (name="bean1")
	Person getPerson1(){
		Person p1 = new Person("paloma","madrid",8);
		return p1;
	}

	@Bean (name="bean2")
	Person getPerson2(){
		Person p2 = new Person("paloma","mexico",78);
		return p2;
	}


	@Bean(name="bean3")
	Person getPerson3(){
		Person p3 = new Person("paloma","lolipop",45);
		return p3;
	}

}
