package com.example.myall1.ui.fragments.restaurantFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurantsDatum;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RestaurantViewModel extends ViewModel {


    private RestaurantDataSourceFactory restaurantDataSourceFactory = new RestaurantDataSourceFactory();
    //  private Repository_res repository_res = new Repository_res();
    // private LiveData<RestaurantDataSource> restaurantDataSourceLiveData = restaurantDataSourceFactory.getMutableLiveData();

    private Executor executor = Executors.newFixedThreadPool(5);


    PagedList.Config config = (new PagedList.Config.Builder()).setEnablePlaceholders(true).setInitialLoadSizeHint(10)
            .setPageSize(20).setPrefetchDistance(4).build();

    private LiveData<PagedList<ListOfRestaurantsDatum>> restaurantPageList =
            (new LivePagedListBuilder<Integer, ListOfRestaurantsDatum>(restaurantDataSourceFactory, config))
                    .setFetchExecutor(executor).build();


    public LiveData<PagedList<ListOfRestaurantsDatum>> getRestaurantPageList() {
        return restaurantPageList;
    }

//    public LiveData<List<ListOfRestaurantsDatum>> getRestaurants(int page) {
//
//        return repository_res.getRestaurants(page);
//    }


}

