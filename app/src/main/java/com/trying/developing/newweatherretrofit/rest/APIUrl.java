package com.trying.developing.newweatherretrofit.rest;

public class APIUrl  {

    public static final String BasrUrl="https://api.openweathermap.org";

    public static  APIService getService(){
        return   RestClient.getClient(BasrUrl).create(APIService.class);
    }


}
