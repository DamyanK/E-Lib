package com.example.elib.models;

import com.google.gson.annotations.SerializedName;

public class BookExcerpt {
    @SerializedName("rendered")
    private String rendered;
    @SerializedName("protected")
    private boolean protectedBookElement;

    public String getRendered() {
        return rendered;
    }

    public boolean getProtectedBookElement() {
        return protectedBookElement;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public void setProtectedBookElement(boolean protectedBookElement) {
        this.protectedBookElement = protectedBookElement;
    }
}
