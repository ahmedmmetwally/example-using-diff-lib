package com.example.myall1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myall1.R;
import com.example.myall1.databinding.RestaurantShapBinding;
import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurantsDatum;

public class HomeFragmentAdapter extends PagedListAdapter<ListOfRestaurantsDatum, HomeFragmentAdapter.ViewHolderr> {

    // private  OnMYItemClickListener listener;
    private Context context;

    public HomeFragmentAdapter(Context context) {
        super(ListOfRestaurantsDatum.CALLBACK);
        this.context = context;


    }

    @NonNull
    @Override
    public ViewHolderr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RestaurantShapBinding restaurantShapBinding = DataBindingUtil.inflate(LayoutInflater.from(context)
                , R.layout.restaurant_shap, parent, false);
        return new ViewHolderr(restaurantShapBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderr holder, int position) {
        ListOfRestaurantsDatum listt = getItem(position);
        holder.restaurantShapBinding.setRestaurantData(listt);
        if (listt.getAvailability().equals("open")) {
            holder.restaurantShapBinding.fragmentHomeImgOnOff.setImageResource(R.drawable.circle_shape_on);
//            holder.restaurantShapBinding.fragmentHomeTxtOpenClose.setText(listt.getAvailability());
        }
    }

    public class ViewHolderr extends RecyclerView.ViewHolder {
        RestaurantShapBinding restaurantShapBinding;

        public ViewHolderr(@NonNull RestaurantShapBinding restaurantShapBinding) {
            super(restaurantShapBinding.getRoot());
            this.restaurantShapBinding = restaurantShapBinding;

        }
    }
}

