package com.example.mvpframe.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvpframe.R;
import com.example.mvpframe.base.BaseActivity;

import com.example.mvpframe.bean.NewsBean;
import com.example.mvpframe.contract.MainContract;
import com.example.mvpframe.presenter.MainPresenter;
import com.example.mvpframe.util.ProgressDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @BindView(R.id.btn_getdata)
    Button btnGetdata;
    @BindView(R.id.showNews)
    TextView showNews;
    private MainPresenter mainPresenter;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // TODO: add setContentView(...) invocation
        unbinder = ButterKnife.bind(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public Unbinder getBind() {
        return unbinder;
    }

    @Override
    public void initView() {
        mainPresenter = new MainPresenter();
        mainPresenter.attachView(this);
    }


    @Override
    public void onSuccess(NewsBean bean) {
        Toast.makeText(this, bean.getResult().getStat(), Toast.LENGTH_SHORT).show();
        showNews.setText(bean.getResult().getData().get(0).getTitle());
    }

    @Override
    public void showLoading() {
        ProgressDialog.getInstance().show(this);
    }

    @Override
    public void hideLoading() {
        ProgressDialog.getInstance().dismiss();
    }

    @Override
    public void onError(Throwable throwable) {

    }




    @OnClick(R.id.btn_getdata)
    public void onViewClicked() {
        mainPresenter.getNews("top", "d16409c00187817c7c9f2dba10ccccf6");
    }

}
