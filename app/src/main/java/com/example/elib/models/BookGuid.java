package com.example.elib.models;

import com.google.gson.annotations.SerializedName;

public class BookGuid {
    @SerializedName("rendered")
    private String rendered;


    // Getter Methods

    public String getRendered() {
        return rendered;
    }

    // Setter Methods

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }
}
