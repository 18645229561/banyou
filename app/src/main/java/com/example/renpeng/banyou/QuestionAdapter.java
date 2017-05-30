package com.example.renpeng.banyou;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by renpeng on 17/5/30.
 */

public class QuestionAdapter extends BaseAdapter {

    private List<String> list;

    public QuestionAdapter(List<String> list){
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_item_layout, null, false);
        TextView textView  = (TextView) view.findViewById(R.id.question_text);
        textView.setText(list.get(position));
        return view;
    }
}
