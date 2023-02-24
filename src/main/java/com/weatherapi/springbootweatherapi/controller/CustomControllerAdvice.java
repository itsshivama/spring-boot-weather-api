package com.weatherapi.springbootweatherapi.controller;

import com.weatherapi.springbootweatherapi.Exception.CityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomControllerAdvice {

    @ExceptionHandler(CityNotFoundException.class)
    public ResponseEntity<String> handleCityNotFoundException(){
        return new ResponseEntity<>("Sorry Such City is not in database, Please recheck the city name", HttpStatus.NOT_FOUND);
    }

}
