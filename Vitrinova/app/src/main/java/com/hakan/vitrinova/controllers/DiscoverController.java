package com.hakan.vitrinova.controllers;

import android.util.Log;

import com.hakan.vitrinova.callbacks.DiscoverCallBack;
import com.hakan.vitrinova.models.Discover;
import com.hakan.vitrinova.services.ApiClient;
import com.hakan.vitrinova.services.RestInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DiscoverController {

    private RestInterface restInterface = ApiClient.getClient().create(RestInterface.class);

    private volatile static DiscoverController instance;

    public DiscoverController() {
    }

    public static DiscoverController getInstance() {
        if (instance == null)
        {
            synchronized (DiscoverController.class) {
                if (instance == null) {
                    instance = new DiscoverController();
                }
            }
        }
        return instance;
    }

    public void getDiscover(DiscoverCallBack discoverCallBack) {
        Call<List<Discover>> call = restInterface.getDiscover();

        call.enqueue(new Callback<List<Discover>>() {
            @Override
            public void onResponse(Call<List<Discover>> call, Response<List<Discover>> response) {
                if (response.body() != null) {
                    Log.d("successTag", response.body().toString());

                    discoverCallBack.onSuccess(response.body());
                }
                else
                {
                    try {
                        Log.d("errorTag", response.errorBody().string());

                        discoverCallBack.onError();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Discover>> call, Throwable t) {
                Log.d("failTag", t.getMessage());
            }
        });
    }
}
