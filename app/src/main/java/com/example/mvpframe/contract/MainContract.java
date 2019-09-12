package com.example.mvpframe.contract;

import com.example.mvpframe.base.BaseView;


import com.example.mvpframe.bean.NewsBean;

import io.reactivex.Flowable;

public interface MainContract {
    interface Model{
        Flowable<NewsBean> getNews(String type, String key);
    }

    interface View extends BaseView{
        @Override
        void showLoading();

        @Override
        void hideLoading();

        @Override
        void onError(Throwable throwable);

        void onSuccess(NewsBean bean);
    }


    interface Presenter {

        void getNews(String type ,String key);
    }
}
