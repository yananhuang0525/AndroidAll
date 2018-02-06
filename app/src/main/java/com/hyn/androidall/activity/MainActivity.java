package com.hyn.androidall.activity;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.hyn.androidall.R;
import com.hyn.baselibrary.core.BaseActivity;

import cn.qqtheme.framework.picker.DateTimePicker;


public class MainActivity extends BaseActivity implements View.OnClickListener {
    private Button btn_http, btn_get, btn_gv;
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
        btn_gv = (Button) findViewById(R.id.btn_gv);
        btn_gv.setOnClickListener(this);
        btn_get = (Button) findViewById(R.id.btn_get);
        btn_get.setOnClickListener(this);
        tv_show = (TextView) findViewById(R.id.tv_show);
        iv = (ImageView) findViewById(R.id.iv);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_http:
//                Glide.with(this).load("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/logo_white_fe6da1ec.png").placeholder(R.mipmap.ic_launcher).into(iv);
                Glide.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1504778093901&di=5a519d2fae22caa17ea8243b35ee3a1e&imgtype=0&src=http%3A%2F%2Fwww.zhlzw.com%2FUploadFiles%2FArticle_UploadFiles%2F201204%2F20120412123926750.jpg").placeholder(R.mipmap.ic_launcher).into(iv);
                break;
            case R.id.btn_get://获取经纬度
                iv.animate().translationX(200).setDuration(2000);
                break;
            case R.id.btn_gv:
                startActivity(new Intent(this, GridViewActivity.class));
                break;
        }
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void selectDate(View view) {
        DateTimePicker dateTimePicker = new DateTimePicker(this, DateTimePicker.HOUR_24);
        dateTimePicker.setDateRangeStart(2017, 1, 1);
        dateTimePicker.setDateRangeEnd(2050, 12, 31);
        dateTimePicker.setOnDateTimePickListener(new DateTimePicker.OnYearMonthDayTimePickListener() {
            @Override
            public void onDateTimePicked(String year, String month, String day, String hour, String minute) {
                showToast(year + "年" + month + "月" + day + "日 " + hour + ":" + minute);
            }
        });
        dateTimePicker.show();
    }

    public void onRefresh(View view) {
        startActivity(new Intent(this, RefreshActivity.class));
    }
}
