package com.example.mvpframe.model;



import com.example.mvpframe.bean.NewsBean;
import com.example.mvpframe.contract.MainContract;
import com.example.mvpframe.net.RetrofitClient;

import io.reactivex.Flowable;

public class MainModel implements MainContract.Model {

    @Override
    public Flowable<NewsBean> getNews(String type, String key) {
        return RetrofitClient.getInstance().getApi().getNews(type,key);
    }
}
