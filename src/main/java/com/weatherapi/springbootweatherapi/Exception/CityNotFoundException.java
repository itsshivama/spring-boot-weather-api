package com.weatherapi.springbootweatherapi.Exception;

public class CityNotFoundException extends RuntimeException {

    public CityNotFoundException(){
        System.out.println("The City Name Entered by User was Wrong");
    }

    public CityNotFoundException(String message){
        System.out.println(message);
    }

}
