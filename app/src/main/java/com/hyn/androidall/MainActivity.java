package com.hyn.androidall;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hyn.baselibrary.core.BaseActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {
    private Button btn_http, btn_get;
    private TextView tv_show;
    private double latitude = 0.0;
    private double longitude = 0.0;
    private LocationManager locationManager;
    private String locationProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_http = (Button) findViewById(R.id.btn_http);
        btn_http.setOnClickListener(this);
        btn_get = (Button) findViewById(R.id.btn_get);
        btn_get.setOnClickListener(this);
        tv_show = (TextView) findViewById(R.id.tv_show);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_http:
                break;
            case R.id.btn_get://获取经纬度
                break;
        }
    }

    public void selectDate(View view) {

    }
}
