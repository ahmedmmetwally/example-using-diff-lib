package com.example.myall1.ui.fragments.restaurantFragment;


import android.content.res.Configuration;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myall1.adapters.HomeFragmentAdapter;
import com.example.myall1.R;
import com.example.myall1.databinding.FragmentShowRestaurantBinding;
import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurantsDatum;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {
    private PagedList<ListOfRestaurantsDatum> restaurantsData;

    private HomeFragmentAdapter mAdapter;
    private LinearLayoutManager linearLayoutManager;
    private RestaurantViewModel restaurantViewModel;
    FragmentShowRestaurantBinding fragmentShowRestaurantBinding;

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_restaurant, container, false);
        fragmentShowRestaurantBinding = DataBindingUtil.setContentView(getActivity(), R.layout.fragment_show_restaurant);
        restaurantViewModel = ViewModelProviders.of(this).get(RestaurantViewModel.class);


        fragmentShowRestaurantBinding.homeFragmentSwipeFresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getRestaurant();
            }
        });
        getRestaurant();
        return view;
    }

    private void initRecycler() {
//        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
//
//            fragmentShowRestaurantBinding.homeFragmentRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));
//        } else {
//
//
//            fragmentShowRestaurantBinding.homeFragmentRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
//
//        }

        linearLayoutManager = new LinearLayoutManager(getActivity());
        fragmentShowRestaurantBinding.homeFragmentRecyclerView.setLayoutManager(linearLayoutManager);
        mAdapter = new HomeFragmentAdapter(getContext());
        mAdapter.submitList(restaurantsData);
        fragmentShowRestaurantBinding.homeFragmentRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();


    }


    private void getRestaurant() {
//restaurantViewModel.getRestaur(1).observe(getActivity(), new Observer<List<ListOfRestaurantsDatum>>() {
//    @Override
//    public void onChanged(List<ListOfRestaurantsDatum> listOfRestaurantsData) {
//        fragmentShowRestaurantBinding.homeFragmentSwipeFresh.setRefreshing(false);
//        restaurantsData.addAll(listOfRestaurantsData);
//        mAdapter.notifyDataSetChanged();
//    }
//});
        restaurantViewModel.getRestaurantPageList().observe(getActivity(), new Observer<PagedList<ListOfRestaurantsDatum>>() {
            @Override
            public void onChanged(PagedList<ListOfRestaurantsDatum> listOfRestaurantsData) {
                restaurantsData = (listOfRestaurantsData);
                initRecycler();

            }
        });

    }
}

