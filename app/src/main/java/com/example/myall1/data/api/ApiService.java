package com.example.myall1.data.api;

import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurants;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Query;

public interface ApiService {

    @GET("restaurants")
    Single<ListOfRestaurants> getRestaurants(@Query("page") int page);


}
