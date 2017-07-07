package com.hyn.httpapp.http;

import android.app.Dialog;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Date：2017/7/7
 * Time: 14:30
 * author: huangyanan
 */

public class HttpManager {
    String url = "http://116.255.137.170:8080/001/f/person/info";
    String getInfo = "http://218.28.166.68:9002/TestWeixin/commond.action";

    /**
     * 测试post请求 获取社保信息
     *
     * @param dialog
     * @param name
     * @param idNo
     * @param callBack
     */
    public void getInfo(final Dialog dialog, String name, String idNo, HttpHelp.DataCallBack callBack) {
        Map<String, String> map = new HashMap<>();
        map.put("cxtype", "11");
        map.put("name", name);
        map.put("percard", idNo);
        HttpHelp.post(dialog, url, map, callBack);
    }

    public void get(final Dialog dialog, String percard, HttpHelp.DataCallBack callBack) {
        Map<String, String> jsonMap = new HashMap<>();
        jsonMap.put("percard", percard);
        Map<String, String> map = new HashMap<>();
        map.put("cmd", "1001");
        map.put("Info", JSON.toJSONString(jsonMap));
        HttpHelp.get(dialog, getInfo, map, callBack);
    }
}
