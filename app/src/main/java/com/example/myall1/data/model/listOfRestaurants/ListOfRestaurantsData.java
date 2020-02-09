
package com.example.myall1.data.model.listOfRestaurants;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListOfRestaurantsData {

    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("data")
    @Expose
    private List<ListOfRestaurantsDatum> data = null;
    @SerializedName("first_page_url")
    @Expose
    private String firstPageUrl;
    @SerializedName("from")
    @Expose
    private Integer from;
    @SerializedName("last_page")
    @Expose
    private Integer lastPage;
    @SerializedName("last_page_url")
    @Expose
    private String lastPageUrl;
    @SerializedName("next_page_url")
    @Expose
    private String nextPageUrl;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    @SerializedName("prev_page_url")
    @Expose
    private Object prevPageUrl;
    @SerializedName("to")
    @Expose
    private Integer to;
    @SerializedName("total")
    @Expose
    private Integer total;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public ListOfRestaurantsData withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    public List<ListOfRestaurantsDatum> getData() {
        return data;
    }

    public void setData(List<ListOfRestaurantsDatum> data) {
        this.data = data;
    }

    public ListOfRestaurantsData withData(List<ListOfRestaurantsDatum> data) {
        this.data = data;
        return this;
    }

    public String getFirstPageUrl() {
        return firstPageUrl;
    }

    public void setFirstPageUrl(String firstPageUrl) {
        this.firstPageUrl = firstPageUrl;
    }

    public ListOfRestaurantsData withFirstPageUrl(String firstPageUrl) {
        this.firstPageUrl = firstPageUrl;
        return this;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public ListOfRestaurantsData withFrom(Integer from) {
        this.from = from;
        return this;
    }

    public Integer getLastPage() {
        return lastPage;
    }

    public void setLastPage(Integer lastPage) {
        this.lastPage = lastPage;
    }

    public ListOfRestaurantsData withLastPage(Integer lastPage) {
        this.lastPage = lastPage;
        return this;
    }

    public String getLastPageUrl() {
        return lastPageUrl;
    }

    public void setLastPageUrl(String lastPageUrl) {
        this.lastPageUrl = lastPageUrl;
    }

    public ListOfRestaurantsData withLastPageUrl(String lastPageUrl) {
        this.lastPageUrl = lastPageUrl;
        return this;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public ListOfRestaurantsData withNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
        return this;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ListOfRestaurantsData withPath(String path) {
        this.path = path;
        return this;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public ListOfRestaurantsData withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    public Object getPrevPageUrl() {
        return prevPageUrl;
    }

    public void setPrevPageUrl(Object prevPageUrl) {
        this.prevPageUrl = prevPageUrl;
    }

    public ListOfRestaurantsData withPrevPageUrl(Object prevPageUrl) {
        this.prevPageUrl = prevPageUrl;
        return this;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public ListOfRestaurantsData withTo(Integer to) {
        this.to = to;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOfRestaurantsData withTotal(Integer total) {
        this.total = total;
        return this;
    }

}
