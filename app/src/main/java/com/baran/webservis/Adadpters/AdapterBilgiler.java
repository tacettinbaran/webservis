package com.baran.webservis.Adadpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.baran.webservis.Models.Bilgiler;
import com.baran.webservis.R;

import java.util.List;

public class AdapterBilgiler extends BaseAdapter {

    List<Bilgiler> list;
    Context context;

    public AdapterBilgiler(List<Bilgiler> bilgilerList, Context context) {
        this.list = bilgilerList;
        this.context = context;
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
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.layout_listview, parent, false);
        TextView userid = convertView.findViewById(R.id.textViewUserId);
        TextView id = convertView.findViewById(R.id.textViewId);
        TextView title = convertView.findViewById(R.id.textViewTitle);
        TextView body = convertView.findViewById(R.id.textViewBody);

        userid.setText(""+list.get(position).getUserId());
        id.setText(""+list.get(position).getId());
        title.setText(list.get(position).getTitle());
        body.setText(list.get(position).getBody());

        return convertView;
    }
}
