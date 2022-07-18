package com.example.weatherapp;

import com.google.gson.annotations.SerializedName;

public class City {
    @SerializedName("temp")
    private String temp;

    @SerializedName("temp_min")
    private String tempMin;
    @SerializedName("temp_max")
    private String tempMax;

    public City() {
    }

    public City(String temp, String tempMin, String tempMax) {
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTempMin() {
        return tempMin;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public String getTempMax() {
        return tempMax;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

}
