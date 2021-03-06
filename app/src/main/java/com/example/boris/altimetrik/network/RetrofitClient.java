package com.example.boris.altimetrik.network;

import android.app.Application;
import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    /**
     * URLS
     **/
    private static final String BASE_URL = "https://api.donorschoose.org/";

    /**
     * Retrofit instance
     **/
    private static Retrofit getRetrofitInstance(){
        Log.d("tag", "Getting retrofit instance");

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * Api Service
     **/
    public static ApiService getApiService(){
        Log.d("tag", "Getting ApiService Instance");
        return getRetrofitInstance().create(ApiService.class);
    }



}
