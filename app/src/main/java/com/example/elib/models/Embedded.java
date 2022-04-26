package com.example.elib.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Embedded {
    @SerializedName("wp:featuredmedia")
    List<WpFeaturedmedia> wpFeaturedmedia;

    public List<WpFeaturedmedia> getWpFeaturedmedia() {
        return wpFeaturedmedia;
    }

    public void setWpFeaturedmedia(List<WpFeaturedmedia> wpFeaturedmedia) {
        this.wpFeaturedmedia = wpFeaturedmedia;
    }
}
