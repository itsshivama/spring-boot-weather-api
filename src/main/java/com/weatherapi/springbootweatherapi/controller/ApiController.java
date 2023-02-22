package com.weatherapi.springbootweatherapi.controller;

import com.weatherapi.springbootweatherapi.bean.ApiBean;
import com.weatherapi.springbootweatherapi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("weather")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/weatherCall")
    @ResponseBody
    public ResponseEntity<ApiBean> weatherApiCall(@RequestParam String city){
        ApiBean apiBean = apiService.callApi(city);
        return new ResponseEntity<ApiBean>(apiBean,HttpStatus.OK);
    }
}
