package com.hyn.androidall.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hyn.androidall.R;
import com.hyn.androidall.biz.GridItemInfo;

import java.util.List;

/**
 * Date：2018/2/6
 * Time: 11:39
 * author: huang ya nan
 */

public class GridViewAdapter extends BaseQuickAdapter<GridItemInfo, BaseViewHolder> {
    public GridViewAdapter(List<GridItemInfo> list) {
        super(R.layout.item_grid, list);
    }

    @Override
    protected void convert(BaseViewHolder helper, GridItemInfo item) {
        helper.setImageResource(R.id.item_iv, item.getId()).setText(R.id.item_tv, item.getName());
    }
}
