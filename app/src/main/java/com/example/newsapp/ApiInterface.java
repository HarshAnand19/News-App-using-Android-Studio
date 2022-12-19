package com.example.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URL="https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<mainNews> getNews(
        @Query("country") String country,
        @Query("pageSize") int pageSize,
        @Query("apiKey") String apiKey
    );

    @GET("top-headlines")
    Call<mainNews> getCategoryNews(
        @Query("country") String country,
        @Query("pageSize") String pageSize,
        @Query("category") int category,
        @Query("apiKey") String apiKey
    );
}
