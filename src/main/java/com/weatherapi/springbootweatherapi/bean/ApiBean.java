package com.weatherapi.springbootweatherapi.bean;

public class ApiBean {
    private String main;
    private String country;
    private float temp;

    public ApiBean(String main, String country, float temp) {
        this.main = main;
        this.country = country;
        this.temp = temp;
    }

    public ApiBean(){}

    @Override
    public String toString() {
        return "ApiBean{" +
                "main='" + main + '\'' +
                ", country='" + country + '\'' +
                ", temp=" + temp +
                '}';
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
}
