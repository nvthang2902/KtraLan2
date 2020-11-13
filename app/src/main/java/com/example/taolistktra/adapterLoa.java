package com.example.taolistktra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapterLoa extends BaseAdapter {

    private android.content.Context Context;
    private int Layout;
    private List<Loa> LoaList;

    public adapterLoa(android.content.Context context, int layout, List<Loa> loaList) {
        Context = context;
        Layout = layout;
        LoaList = loaList;
    }



    @Override
    public int getCount() {
        return LoaList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater infalter = (LayoutInflater) Context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = infalter.inflate(Layout,null);

        TextView txtTen = (TextView) view.findViewById(R.id.ngonNgu);

        TextView txtMota = (TextView) view.findViewById(R.id.moTa);

        ImageView image = (ImageView) view.findViewById(R.id.image);

        //gan gia tri
        Loa loa = LoaList.get(i);

        //
        txtTen.setText(loa.getTenLoa());
        txtMota.setText(loa.getGia());
        image.setImageResource(loa.getImage());

        return view;
    }
}
