package com.imooc.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wlgbsj on 2017/4/7  11:01.
 */

public class MyAdapter extends BaseAdapter {
    private List<String> datas;
    private LayoutInflater inflater;
    public MyAdapter(List<String> datas, Context context) {
        this.datas =datas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;

        if(convertView==null){
            viewHolder = new ViewHolder();
            inflater.inflate(R.layout.abc_action_bar_title_item,null);

            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }

        return convertView;
    }

    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
