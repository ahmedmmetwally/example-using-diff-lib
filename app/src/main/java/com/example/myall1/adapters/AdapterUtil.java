package com.example.myall1.adapters;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.example.myall1.R;

public class AdapterUtil {
    @BindingAdapter("loadImag")
    public static void setImageUrl(ImageView imageView, String  imageUrl) {

        Glide.with(imageView.getContext())
                .load(imageUrl)
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);
    }
//    @BindingAdapter("openImage")
//    public static void getImageAvailability(String availability){
//
//        if (availability.equals("open")) {
//
//        }else return null;
//        return image;
//    }
}
