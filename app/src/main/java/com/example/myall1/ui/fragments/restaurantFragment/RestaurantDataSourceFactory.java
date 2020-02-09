package com.example.myall1.ui.fragments.restaurantFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;

public class RestaurantDataSourceFactory extends DataSource.Factory {
    private RestaurantDataSource restaurantDataSource = new RestaurantDataSource();
    private MutableLiveData<RestaurantDataSource> mutableLiveData = new MutableLiveData<>();

    @Override
    public DataSource create() {
        mutableLiveData.postValue(restaurantDataSource);
        return restaurantDataSource;
    }

    public MutableLiveData<RestaurantDataSource> getMutableLiveData() {
        return mutableLiveData;
    }
}