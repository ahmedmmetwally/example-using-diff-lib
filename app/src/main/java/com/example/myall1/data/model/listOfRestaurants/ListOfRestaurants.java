
package com.example.myall1.data.model.listOfRestaurants;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfRestaurants {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("data")
    @Expose
    private ListOfRestaurantsData data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListOfRestaurants withStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ListOfRestaurants withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public ListOfRestaurantsData getData() {
        return data;
    }

    public void setData(ListOfRestaurantsData data) {
        this.data = data;
    }

    public ListOfRestaurants withData(ListOfRestaurantsData data) {
        this.data = data;
        return this;
    }

}
