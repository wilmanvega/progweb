package com.spring.ejemplos.crudgrupo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.spring.ejemplos.crudgrupo2.entidades")
public class Crudgrupo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Crudgrupo2Application.class, args);
	}
}
