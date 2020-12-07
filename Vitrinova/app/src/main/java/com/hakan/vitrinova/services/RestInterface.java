package com.hakan.vitrinova.services;

import com.hakan.vitrinova.models.Discover;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestInterface {

    @GET("discover")
    Call<List<Discover>> getDiscover();
}
