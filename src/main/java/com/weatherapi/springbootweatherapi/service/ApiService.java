package com.weatherapi.springbootweatherapi.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weatherapi.springbootweatherapi.bean.ApiBean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class  ApiService {

    public ApiBean callApi(String city){
        ApiBean apiBean = new ApiBean();
        RestTemplate restTemplate = new RestTemplate();
        String API_ID = "61bd5306e482e2121a47fe8d4c197679";
        String URI = "http://api.openweathermap.org/data/2.5/weather?q=";
        city = URI + city + "&APPID=" + API_ID + "&units=metric";
        String Data = restTemplate.getForObject(city,String.class);
        System.out.println(Data);
        JsonNode jn1;
        JsonNode jn2;
        JsonNode jn3;
        try {
            jn1 = new ObjectMapper().readTree(Data).path("main");
            jn2 = new ObjectMapper().readTree(Data).path("weather");
            jn3 = new ObjectMapper().readTree(Data).path("sys");

            apiBean.setTemp(Float.parseFloat(jn1.get("temp").toString()));
            apiBean.setMain(jn2.get(0).get("main").toString());
            apiBean.setCountry(jn3.get("country").toString());
        }
        catch (Exception e){
            System.out.println("Sorry But there is an error");
            return null;
        }
        return apiBean;
    }
}
