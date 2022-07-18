package com.example.weatherapp;

import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("main")
    private City city;


    public Results() {
    }

    public Results(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
