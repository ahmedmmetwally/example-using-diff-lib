package com.example.myall1.ui.fragments.restaurantFragment;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

import com.example.myall1.data.api.RetrofitSofra;
import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurants;
import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurantsDatum;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
//import io.reactivex.android.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RestaurantDataSource extends PageKeyedDataSource<Integer, ListOfRestaurantsDatum> {
    List<ListOfRestaurantsDatum> restaurantList ;
    private static final String TAG = "ahmed";

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, ListOfRestaurantsDatum> callback) {
        Single<List<ListOfRestaurantsDatum>> single=RetrofitSofra.getInstance().getRestaurants(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).map(new Function<ListOfRestaurants, List<ListOfRestaurantsDatum>>() {
                    @Override
                    public List<ListOfRestaurantsDatum> apply(ListOfRestaurants listOfRestaurants) throws Exception {
                        restaurantList=new ArrayList<>();
                        restaurantList.addAll(listOfRestaurants.getData().getData());
                        return restaurantList;
                    }
                });
      SingleObserver<List<ListOfRestaurantsDatum>> singleObserver=new SingleObserver<List<ListOfRestaurantsDatum>>() {
          @Override
          public void onSubscribe(Disposable d) {

          }

          @Override
          public void onSuccess(List<ListOfRestaurantsDatum> listOfRestaurantsData) {
              if ( restaurantList != null) {
                  callback.onResult(restaurantList, null,2);
              }
          }

          @Override
          public void onError(Throwable e) {

          }
      };

single.subscribe(singleObserver);

    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, ListOfRestaurantsDatum> callback) {

    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull final LoadCallback<Integer, ListOfRestaurantsDatum> callback) {
        Single<List<ListOfRestaurantsDatum>> single=RetrofitSofra.getInstance().getRestaurants(params.key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).map(new Function<ListOfRestaurants, List<ListOfRestaurantsDatum>>() {
                    @Override
                    public List<ListOfRestaurantsDatum> apply(ListOfRestaurants listOfRestaurants) throws Exception {
                        restaurantList=new ArrayList<>();
                        restaurantList.addAll(listOfRestaurants.getData().getData());
                        return restaurantList;
                    }
                });
        SingleObserver<List<ListOfRestaurantsDatum>> singleObserver=new SingleObserver<List<ListOfRestaurantsDatum>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onSuccess(List<ListOfRestaurantsDatum> listOfRestaurantsData) {
                if ( restaurantList != null) {
                    callback.onResult(restaurantList,params.key+1);
                }
            }

            @Override
            public void onError(Throwable e) {

            }
        };

    }
}



//  RetrofitSofra.getInstance().getRestaurants(1).enqueue(new Callback<ListOfRestaurants>() {
//@Override
//public void onResponse(Call<ListOfRestaurants> call, Response<ListOfRestaurants> response) {
//        ListOfRestaurants listOfRestaurants = response.body();
//        restaurantList = new ArrayList<>();
//        restaurantList = listOfRestaurants.getData().getData();
//        if (listOfRestaurants != null && restaurantList != null) {
//        callback.onResult(restaurantList, null,2);
//        }
//
//        }
//
//@Override
//public void onFailure(Call<ListOfRestaurants> call, Throwable t) {
//
//        }
//        });