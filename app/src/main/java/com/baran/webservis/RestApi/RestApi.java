package com.baran.webservis.RestApi;

import com.baran.webservis.Models.Bilgiler;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface RestApi {

//    https://jsonplaceholder.typicode.com/posts

    @GET("/posts")
    Call<List<Bilgiler>> bilgiGetir();
}
