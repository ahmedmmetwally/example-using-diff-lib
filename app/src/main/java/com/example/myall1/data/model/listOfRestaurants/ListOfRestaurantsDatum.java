
package com.example.myall1.data.model.listOfRestaurants;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfRestaurantsDatum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("region_id")
    @Expose
    private String regionId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("delivery_time")
    @Expose
    private String deliveryTime;
    @SerializedName("delivery_cost")
    @Expose
    private String deliveryCost;
    @SerializedName("minimum_charger")
    @Expose
    private String minimumCharger;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("whatsapp")
    @Expose
    private String whatsapp;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("availability")
    @Expose
    private String availability;
    @SerializedName("activated")
    @Expose
    private String activated;
    @SerializedName("rate")
    @Expose
    private Float rate;
    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ListOfRestaurantsDatum withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListOfRestaurantsDatum withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ListOfRestaurantsDatum withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListOfRestaurantsDatum withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListOfRestaurantsDatum withName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ListOfRestaurantsDatum withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public ListOfRestaurantsDatum withDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }

    public String getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(String deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public ListOfRestaurantsDatum withDeliveryCost(String deliveryCost) {
        this.deliveryCost = deliveryCost;
        return this;
    }

    public String getMinimumCharger() {
        return minimumCharger;
    }

    public void setMinimumCharger(String minimumCharger) {
        this.minimumCharger = minimumCharger;
    }

    public ListOfRestaurantsDatum withMinimumCharger(String minimumCharger) {
        this.minimumCharger = minimumCharger;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ListOfRestaurantsDatum withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public ListOfRestaurantsDatum withWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ListOfRestaurantsDatum withPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public ListOfRestaurantsDatum withAvailability(String availability) {
        this.availability = availability;
        return this;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public ListOfRestaurantsDatum withActivated(String activated) {
        this.activated = activated;
        return this;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public ListOfRestaurantsDatum withRate(Float rate) {
        this.rate = rate;
        return this;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public ListOfRestaurantsDatum withPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }


    public static final DiffUtil.ItemCallback<ListOfRestaurantsDatum> CALLBACK = new DiffUtil.ItemCallback<ListOfRestaurantsDatum>() {
        @Override
        public boolean areItemsTheSame(@NonNull ListOfRestaurantsDatum oldItem, @NonNull ListOfRestaurantsDatum newItem) {
            return oldItem.id == newItem.id;
        }

        @Override
        public boolean areContentsTheSame(@NonNull ListOfRestaurantsDatum oldItem, @NonNull ListOfRestaurantsDatum newItem) {
            return true;
        }
    };


}
