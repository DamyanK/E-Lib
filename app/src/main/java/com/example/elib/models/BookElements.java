package com.example.elib.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BookElements {
    @SerializedName("id")
    private float id;
    @SerializedName("date")
    private String date;
    @SerializedName("date_gmt")
    private String date_gmt;
    @SerializedName("guid")
    BookGuid GuidObject;
    @SerializedName("modified")
    private String modified;
    @SerializedName("modified_gmt")
    private String modified_gmt;
    @SerializedName("slug")
    private String slug;
    @SerializedName("status")
    private String status;
    @SerializedName("type")
    private String type;
    @SerializedName("link")
    private String link;
    @SerializedName("title")
    BookTitle TitleObject;
    @SerializedName("content")
    BookContent ContentObject;
    @SerializedName("excerpt")
    BookExcerpt ExcerptObject;
    @SerializedName("author")
    private float author;
    @SerializedName("featured_media")
    private float featured_media;
    @SerializedName("comment_status")
    private String comment_status;
    @SerializedName("ping_status")
    private String ping_status;
    @SerializedName("sticky")
    private boolean sticky;
    @SerializedName("template")
    private String template;
    @SerializedName("format")
    private String format;
    @SerializedName("meta")
    ArrayList< Object > meta = new ArrayList < Object > ();
    @SerializedName("categories")
    ArrayList < Object > categories = new ArrayList < Object > ();
    @SerializedName("tags")
    ArrayList < Object > tags = new ArrayList < Object > ();
    @SerializedName("_links")
    PostsLinks linksObject;
    @SerializedName("_embedded")
    Embedded embedded;



    // Getter Methods

    public Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

    public ArrayList<Object> getMeta() {
        return meta;
    }

    public void setMeta(ArrayList<Object> meta) {
        this.meta = meta;
    }

    public ArrayList<Object> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Object> categories) {
        this.categories = categories;
    }

    public ArrayList<Object> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Object> tags) {
        this.tags = tags;
    }

    public float getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getDate_gmt() {
        return date_gmt;
    }

    public BookGuid getGuid() {
        return GuidObject;
    }

    public String getModified() {
        return modified;
    }

    public String getModified_gmt() {
        return modified_gmt;
    }

    public String getSlug() {
        return slug;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public String getLink() {
        return link;
    }

    public BookTitle getBookTitle() {
        return TitleObject;
    }

    public BookContent getBookContent() {
        return ContentObject;
    }

    public BookExcerpt getBookExcerpt() {
        return ExcerptObject;
    }

    public float getAuthor() {
        return author;
    }

    public float getFeatured_media() {
        return featured_media;
    }

    public String getComment_status() {
        return comment_status;
    }

    public String getPing_status() {
        return ping_status;
    }

    public boolean getSticky() {
        return sticky;
    }

    public String getTemplate() {
        return template;
    }

    public String getFormat() {
        return format;
    }

    public PostsLinks getPostLinks() {
        return linksObject;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDate_gmt(String date_gmt) {
        this.date_gmt = date_gmt;
    }

    public void setGuid(BookGuid guidObject) {
        this.GuidObject = guidObject;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public void setModified_gmt(String modified_gmt) {
        this.modified_gmt = modified_gmt;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setBookTitle(BookTitle titleObject) {
        this.TitleObject = titleObject;
    }

    public void setBookContent(BookContent contentObject) {
        this.ContentObject = contentObject;
    }

    public void setBookExcerpt(BookExcerpt excerptObject) {
        this.ExcerptObject = excerptObject;
    }

    public void setAuthor(float author) {
        this.author = author;
    }

    public void setFeatured_media(float featured_media) {
        this.featured_media = featured_media;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public void setPing_status(String ping_status) {
        this.ping_status = ping_status;
    }

    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setPostLinks(PostsLinks linksObject) {
        this.linksObject = linksObject;
    }
}
