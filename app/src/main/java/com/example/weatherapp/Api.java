package com.example.weatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    final String BASE_URL = "https://api.openweathermap.org/data/2.5/";
    final String APP_ID = "ab653a14459fe02a84dc6925ac9557d3";
    final String LANG = "es";
    final String UNITS = "metric";

    @GET("weather?")
    Call<Results> getTempOfCity(@Query("APPID") String appId,@Query("lang") String lang,@Query("units")String units,@Query("q") String city);




}
