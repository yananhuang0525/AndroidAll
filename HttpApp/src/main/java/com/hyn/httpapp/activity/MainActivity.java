package com.hyn.httpapp.activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hyn.httpapp.R;
import com.hyn.httpapp.http.HttpHelp;
import com.hyn.httpapp.http.HttpManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_post, btn_get, btn_download, btn_upload;
    private TextView tv_show;
    private HttpManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_http);
        tv_show = (TextView) findViewById(R.id.tv_show);
        btn_download = (Button) findViewById(R.id.btn_download);
        btn_post = (Button) findViewById(R.id.btn_post);
        btn_get = (Button) findViewById(R.id.btn_get);
        btn_upload = (Button) findViewById(R.id.btn_upload);
        btn_download.setOnClickListener(this);
        btn_upload.setOnClickListener(this);
        btn_get.setOnClickListener(this);
        btn_post.setOnClickListener(this);
        manager = new HttpManager();
    }

    @Override
    public void onClick(View v) {
        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setMessage("请稍等。。。");
        switch (v.getId()) {
            case R.id.btn_post:
                manager.getInfo(dialog, "黄亚南", "410225199105251574", new HttpHelp.DataCallBack() {
                    @Override
                    public void onSuccess(String result) {
                        tv_show.setText(result);
                    }

                    @Override
                    public void onError(Throwable error) {
                        tv_show.setText(error.getMessage());
                    }
                });
                break;
            case R.id.btn_get:
                manager.get(dialog, "410225199105251574", new HttpHelp.DataCallBack() {
                    @Override
                    public void onSuccess(String result) {
                        tv_show.setText(result);
                    }

                    @Override
                    public void onError(Throwable error) {
                        tv_show.setText(error.getMessage());
                    }
                });
                break;
            case R.id.btn_download:
                break;
            case R.id.btn_upload:
                break;
        }
    }
}
