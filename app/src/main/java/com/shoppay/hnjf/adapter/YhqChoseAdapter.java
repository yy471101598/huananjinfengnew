package com.shoppay.hnjf.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.shoppay.hnjf.R;
import com.shoppay.hnjf.bean.OilYhq;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by songxiaotao on 2017/7/2.
 */

public class YhqChoseAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<OilYhq> items;

    public YhqChoseAdapter(Context context, List<OilYhq> items) {
        super();
        this.inflater = LayoutInflater.from(context);
        this.items = items;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_yhqchose, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        OilYhq item = items.get(position);
        holder.itemOilname.setText(item.CouponName);
        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.item_oilname)
        TextView itemOilname;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
