package com.hyn.androidall;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.hyn.baselibrary.core.BaseActivity;

import cn.qqtheme.framework.picker.DateTimePicker;


public class MainActivity extends BaseActivity implements View.OnClickListener {
    private Button btn_http, btn_get;
    private TextView tv_show;
    private double latitude = 0.0;
    private double longitude = 0.0;
    private LocationManager locationManager;
    private String locationProvider;
    private ImageView iv;

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
        iv = (ImageView) findViewById(R.id.iv);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_http:
                Glide.with(this).load("http://ww4.sinaimg.cn/large/610dc034gw1f96kp6faayj20u00jywg9.jpg").placeholder(R.mipmap.ic_launcher).into(iv);
                break;
            case R.id.btn_get://获取经纬度
                break;
        }
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void selectDate(View view) {
        DateTimePicker dateTimePicker = new DateTimePicker(this, DateTimePicker.HOUR_12);
        dateTimePicker.setDateRangeStart(2017, 1, 1);
        dateTimePicker.setDateRangeEnd(2050, 12, 31);
        dateTimePicker.setOnDateTimePickListener(new DateTimePicker.OnYearMonthDayTimePickListener() {
            @Override
            public void onDateTimePicked(String year, String month, String day, String hour, String minute) {
                showToast(year + "-" + month + "-" + day + " " + hour + ":" + minute);
            }
        });
        dateTimePicker.show();
    }

    public void onRefresh(View view) {
        startActivity(new Intent(this, RefreshActivity.class));
    }
}
