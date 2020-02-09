package com.example.myall1.ui.fragments.restaurantFragment;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

import com.example.myall1.data.api.RetrofitSofra;
import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurants;
import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurantsDatum;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RestaurantDataSource extends PageKeyedDataSource<Integer, ListOfRestaurantsDatum> {
    List<ListOfRestaurantsDatum> restaurantList;

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, ListOfRestaurantsDatum> callback) {
        RetrofitSofra.getInstance().getRestaurants(1).enqueue(new Callback<ListOfRestaurants>() {
            @Override
            public void onResponse(Call<ListOfRestaurants> call, Response<ListOfRestaurants> response) {
                ListOfRestaurants listOfRestaurants = response.body();
                restaurantList = new ArrayList<>();
                restaurantList = listOfRestaurants.getData().getData();
                if (listOfRestaurants != null && restaurantList != null) {
                    callback.onResult(restaurantList, null, 2);
                }

            }

            @Override
            public void onFailure(Call<ListOfRestaurants> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, ListOfRestaurantsDatum> callback) {

    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull final LoadCallback<Integer, ListOfRestaurantsDatum> callback) {
        RetrofitSofra.getInstance().getRestaurants(params.key).enqueue(new Callback<ListOfRestaurants>() {
            @Override
            public void onResponse(Call<ListOfRestaurants> call, Response<ListOfRestaurants> response) {
                ListOfRestaurants listOfRestaurants = response.body();
                restaurantList = new ArrayList<>();
                restaurantList = listOfRestaurants.getData().getData();
                if (listOfRestaurants != null && restaurantList != null) {
                    callback.onResult(restaurantList, params.key + 1);
                }

            }

            @Override
            public void onFailure(Call<ListOfRestaurants> call, Throwable t) {

            }
        });
    }
}
