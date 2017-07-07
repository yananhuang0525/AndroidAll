package com.hyn.httpapp.http;

import android.app.Dialog;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.FileCallback;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

import java.io.File;
import java.util.Map;

/**
 * Date：2017/7/7
 * Time: 15:14
 * author: huangyanan
 */

public class HttpHelp {
    /**
     * POST请求
     *
     * @param dialog
     * @param url      请求地址
     * @param map      请求参数
     * @param callBack
     */
    public static void post(final Dialog dialog, String url, Map<String, String> map, final DataCallBack callBack) {
        OkGo.<String>post(url).params(map).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                callBack.onSuccess(response.body());
            }

            @Override
            public void onStart(Request<String, ? extends Request> request) {
                if (dialog != null && !dialog.isShowing())
                    dialog.show();
            }

            @Override
            public void onFinish() {
                if (dialog != null && dialog.isShowing())
                    dialog.dismiss();
            }

            @Override
            public void onError(Response<String> response) {
                callBack.onError(response.getException());
            }
        });
    }

    /**
     * get请求
     *
     * @param dialog
     * @param url      请求地址
     * @param map      请求参数
     * @param callBack
     */
    public static void get(final Dialog dialog, String url, Map<String, String> map, final DataCallBack callBack) {
        OkGo.<String>get(url).params(map).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                callBack.onSuccess(response.body());
            }

            @Override
            public void onStart(Request<String, ? extends Request> request) {
                if (dialog != null && !dialog.isShowing())
                    dialog.show();
            }

            @Override
            public void onFinish() {
                if (dialog != null && dialog.isShowing())
                    dialog.dismiss();
            }

            @Override
            public void onError(Response<String> response) {
                callBack.onError(response.getException());
            }
        });
    }

    public interface DataCallBack {
        void onSuccess(String result);

        void onError(Throwable error);
    }
}
