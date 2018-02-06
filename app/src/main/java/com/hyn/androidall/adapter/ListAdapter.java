package com.hyn.androidall.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hyn.androidall.R;

import java.util.List;

/**
 * Date：2017/9/1
 * Time: 9:34
 * author: huang ya nan
 */

public class ListAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public ListAdapter(@LayoutRes int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv, item);
    }
}
