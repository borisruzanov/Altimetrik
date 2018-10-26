package com.example.boris.altimetrik.network;

import com.example.boris.altimetrik.Models.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("common/json_feed.html")
    Call<Example> loadData(@Query("APIKey") String key);
}

