package com.trying.developing.newweatherretrofit.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static Retrofit retrofit;
    public static Retrofit getClient(String baseUrl){
        retrofit=new Retrofit.Builder().baseUrl(baseUrl).
                addConverterFactory(GsonConverterFactory.create()).
                build();

        return retrofit;
    }

}
