package com.hakan.vitrinova.callbacks;

import com.hakan.vitrinova.models.Discover;

import java.util.List;

public interface DiscoverCallBack {
    void onSuccess(List<Discover> discoverList);
    void onError();
}
