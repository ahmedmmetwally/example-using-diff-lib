//package com.example.myall1.ui.fragments.restaurantFragment;
//
//import android.util.Log;
//
//import androidx.lifecycle.MutableLiveData;
//
//import com.example.myall1.data.api.RetrofitSofra;
//import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurants;
//import com.example.myall1.data.model.listOfRestaurants.ListOfRestaurantsDatum;
//
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//import static com.example.myall1.helper.HelperMethod.dismissProgressDialog;
//
//public class Repository_res {
//    private MutableLiveData<List<ListOfRestaurantsDatum>> mutableLiveData = new MutableLiveData<>();
//
//    //  private   List<ListOfRestaurantsDatum> res = new ArrayList<>();
//    public MutableLiveData<List<ListOfRestaurantsDatum>> getRestaurants(int page) {
//
//        Log.e("ggggg", "in internetState  in get restaurant list");
//        RetrofitSofra.getInstance().getRestaurants(page).enqueue(new Callback<ListOfRestaurants>() {
//            @Override
//            public void onResponse(Call<ListOfRestaurants> call, Response<ListOfRestaurants> response) {
//                try {
//                    Log.e("ggggg", "in try  in get restaurant list");
//                    if (response.body().getStatus() == 1) {
//                        dismissProgressDialog();
//                        //  res = response.body().getData().getData();
//                        mutableLiveData.setValue(response.body().getData().getData());
//                    } else {
//                    }
//                } catch (Exception e) {
//                    dismissProgressDialog();
//
//                    Log.e("ggggg", "in catch  in get restaurant list");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ListOfRestaurants> call, Throwable t) {
//                Log.e("ggggg", "in failure  in get restaurant list" + t.toString());
//
//
//            }
//        });
//        return mutableLiveData;
//    }
//
//}
