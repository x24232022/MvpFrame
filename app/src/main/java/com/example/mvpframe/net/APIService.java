package com.example.mvpframe.net;

import com.example.mvpframe.bean.NewsBean;

import io.reactivex.Flowable;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface APIService {




    @GET("index")
    Flowable<NewsBean>  getNews(@Query("type") String type,
                                                @Query("key") String key);

}
