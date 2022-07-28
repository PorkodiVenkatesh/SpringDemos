package com.revature.SpringFrameWorkDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean//(name = "carBean")
	public Car getCar() {
		return new Car("Ford");
	}

	@Bean//(name = "bikeBean")
	public Bike getBike() {
		return new Bike();
	}
	
	
	@Bean
	public Tyre getTyre() {
		return new Tyre("Ceat");
	}

}
