package com.hyn.androidall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hyn.androidall.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_http;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_http = (Button) findViewById(R.id.btn_http);
        btn_http.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_http:
                break;
        }
    }
}
