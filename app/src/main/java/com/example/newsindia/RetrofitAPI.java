package com.example.newsindia;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {

    @GET
    Call<NewsModal> getAllNews(@Url String url);

    @GET
    Call<NewsModal> getsNewsByCategory(@Url String url);

}
