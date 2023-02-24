package com.weatherapi.springbootweatherapi.controller;

import com.weatherapi.springbootweatherapi.Exception.CityNotFoundException;
import com.weatherapi.springbootweatherapi.bean.ApiBean;
import com.weatherapi.springbootweatherapi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("weather")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/weatherCall")
    @ResponseBody
    public ResponseEntity<ApiBean> weatherApiCall(@RequestParam String city) throws CityNotFoundException {
        ApiBean apiBean;
        try {
            apiBean = apiService.callApi(city);
        } catch (HttpClientErrorException e) {
            throw new CityNotFoundException(e.getMessage());
        }
        return new ResponseEntity<>(apiBean, HttpStatus.OK);
    }
}