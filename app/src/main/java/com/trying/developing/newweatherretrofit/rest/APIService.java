package com.trying.developing.newweatherretrofit.rest;

import com.trying.developing.newweatherretrofit.Model.Root;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("/data/2.5/weather")
    Call<List<Root>> getWeather(@Query("q") String cityName,
                                @Query("units") String units,
                                @Query("appid") String appId);

}
