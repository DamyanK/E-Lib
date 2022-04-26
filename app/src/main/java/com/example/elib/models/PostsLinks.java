package com.example.elib.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PostsLinks {
    @SerializedName("self")
    ArrayList< Object > self = new ArrayList < Object > ();
    @SerializedName("collection")
    ArrayList < Object > collection = new ArrayList < Object > ();
    @SerializedName("about")
    ArrayList < Object > about = new ArrayList < Object > ();
    @SerializedName("author")
    ArrayList < Object > author = new ArrayList < Object > ();
    @SerializedName("replies")
    ArrayList < Object > replies = new ArrayList < Object > ();
    @SerializedName("version-history")
    ArrayList < Object > versionHistory = new ArrayList < Object > ();
    @SerializedName("predecessor-version")
    ArrayList < Object > predecessorVersion = new ArrayList < Object > ();
    @SerializedName("wp:attachment")
    ArrayList < Object > wpAttachment = new ArrayList < Object > ();
    @SerializedName("wp:term")
    ArrayList < Object > wpTerm = new ArrayList < Object > ();
    @SerializedName("curies")
    ArrayList < Object > curies = new ArrayList < Object > ();
}
