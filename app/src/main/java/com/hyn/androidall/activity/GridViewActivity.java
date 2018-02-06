package com.hyn.androidall.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hyn.androidall.R;
import com.hyn.androidall.adapter.GridViewAdapter;
import com.hyn.androidall.biz.GridItemInfo;
import com.hyn.baselibrary.core.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Date：2018/2/6
 * Time: 11:35
 * author: huang ya nan
 */

public class GridViewActivity extends BaseActivity {
    private RecyclerView rv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_gv);
        rv = (RecyclerView) findViewById(R.id.rv_gv);
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        rv.setAdapter(new GridViewAdapter(getDate()));
    }

    private List<GridItemInfo> getDate() {
        List<GridItemInfo> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            GridItemInfo itemInfo = new GridItemInfo();
            itemInfo.setId(R.mipmap.ic_launcher);
            itemInfo.setName("社保卡服务" + i);
            list.add(itemInfo);
        }
        return list;
    }
}
