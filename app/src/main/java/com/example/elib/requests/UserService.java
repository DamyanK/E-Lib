package com.example.elib.requests;

import com.example.elib.models.BookElements;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {

    @GET("wp-json/wp/v2/posts?_embed")
    Call<List<BookElements>> getBooks();
}
