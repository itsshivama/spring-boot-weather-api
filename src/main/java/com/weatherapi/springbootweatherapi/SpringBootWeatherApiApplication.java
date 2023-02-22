package com.weatherapi.springbootweatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWeatherApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWeatherApiApplication.class, args);
		System.out.println("Weather API call Started");
	}

}
