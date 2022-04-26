package com.example.elib.models;

import com.google.gson.annotations.SerializedName;

public class WpFeaturedmedia {
    @SerializedName("alt_text")
    private String altText;
    @SerializedName("author")
    private int author;
   // @SerializedName("caption")
   // Caption caption;
    @SerializedName("date")
    private String date;
    @SerializedName("id")
    private int id;
    @SerializedName("link")
    private String link;
    //@SerializedName("_links")
    //Links links;
   // @SerializedName("media_details")
    //MediaDetails mediaDetails;
    @SerializedName("media_type")
    private String mediaType;
    @SerializedName("mime_type")
    private String mimeType;
    @SerializedName("slug")
    private String slug;
    @SerializedName("source_url")
    private String sourceUrl;
    //@SerializedName("title")
    //Title title;
    @SerializedName("type")
    private String type;

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
