package com.example.elib.models;

import com.google.gson.annotations.SerializedName;

public class BookTitle {
    @SerializedName("rendered")
    private String rendered;


    public String getRendered() {
        return rendered;
    }


    public void setRendered(String rendered) {
        this.rendered = rendered;
    }
}
