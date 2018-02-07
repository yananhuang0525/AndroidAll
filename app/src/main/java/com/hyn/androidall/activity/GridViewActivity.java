package com.hyn.androidall.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.hyn.androidall.R;
import com.hyn.androidall.adapter.GridViewAdapter;
import com.hyn.androidall.biz.DividerGridItemDecoration;
import com.hyn.androidall.biz.GridItemInfo;
import com.hyn.androidall.biz.MyItemDecoration;
import com.hyn.baselibrary.core.BaseActivity;
import com.lzy.okgo.utils.OkLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Date：2018/2/6
 * Time: 11:35
 * author: huang ya nan
 */

public class GridViewActivity extends BaseActivity {
    private RecyclerView rv;
    private GridViewAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_gv);
        rv = (RecyclerView) findViewById(R.id.rv_gv);
        adapter = new GridViewAdapter(getDate());
        rv.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
//        rv.addItemDecoration(new MyItemDecoration(this, gridLayoutManager.getOrientation(), 2));
        rv.setLayoutManager(gridLayoutManager);
//        rv.addItemDecoration(new DividerGridItemDecoration(this));
//        rv.setLayoutManager(new GridLayoutManager(this, 2));
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                GridItemInfo item = (GridItemInfo) adapter.getItem(position);
                OkLogger.e(item.getName());
            }
        });
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
