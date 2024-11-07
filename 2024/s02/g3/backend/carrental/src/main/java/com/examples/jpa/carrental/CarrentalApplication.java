package com.examples.jpa.carrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.examples.jpa.carrental.servicios"
})
public class CarrentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrentalApplication.class, args);
	}

}
