package com.example.mvpframe.presenter;

import com.example.mvpframe.base.BasePresenter;

import com.example.mvpframe.bean.NewsBean;
import com.example.mvpframe.contract.MainContract;
import com.example.mvpframe.model.MainModel;
import com.example.mvpframe.net.RxScheduler;

import io.reactivex.functions.Consumer;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {
    private MainModel mainModel;

    public MainPresenter() {
       mainModel = new MainModel();
    }

    @Override
    public void getNews(String type ,String key) {
        if(!isViewAttached()){
            return;
        }
        mView.showLoading();
        mainModel.getNews(type,key)
                .compose(RxScheduler.<NewsBean>Flo_io_main())
                .as(mView.<NewsBean>bindAutoDispose())
                .subscribe(new Consumer<NewsBean>() {
                            @Override
                            public void accept(NewsBean newsBeanBaseObjectBean) throws Exception {
                                mView.onSuccess(newsBeanBaseObjectBean);
                                mView.hideLoading();
                            }
                        },
                        new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                mView.onError(throwable);
                                mView.hideLoading();
                            }
                        }

                );
    }

}
