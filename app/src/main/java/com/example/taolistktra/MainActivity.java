package com.example.taolistktra;

import android.os.Build;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.Toolbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar1;
    GridView lvMonAn;
    ArrayList<Loa> loa;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonAn=(GridView) findViewById(R.id.gridView);
        loa= new ArrayList<Loa>();
        //thêm món ăn vào mảng Món Ăn đang tới
        loa.add(new Loa("Loa karaoke va nge nhac 3 tac thùng","2.000 VNĐ",R.drawable.download));
        loa.add(new Loa("Loa karaoke va nge nhac 3 tac thùng","2.000 VNĐ",R.drawable.download));
        loa.add(new Loa("Loa karaoke va nge nhac 3 tac thùng","2.000 VNĐ",R.drawable.download));
        loa.add(new Loa("Loa karaoke va nge nhac 3 tac thùng","2.000 VNĐ",R.drawable.download));
        loa.add(new Loa("Loa karaoke va nge nhac 3 tac thùng","2.000 VNĐ",R.drawable.download));
        loa.add(new Loa("Loa karaoke va nge nhac 3 tac thùng","2.000 VNĐ",R.drawable.download));




        final adapterLoa anAdapter = new adapterLoa(
                MainActivity.this,
                R.layout.row,
                loa
        );



        lvMonAn.setAdapter(anAdapter);


        TabHost tabhost = (TabHost) findViewById(R.id.tabhost);

        // setting up the tab host
        tabhost.setup();

        // Code thêm Tab 1 vào tabhost
        TabHost.TabSpec spec = tabhost.newTabSpec("All");
        spec.setContent(R.id.tab1);

        // setting the name of the tab 1 as "Tab One"
        spec.setIndicator("All");

        //thêm  tab vào tabhost
        tabhost.addTab(spec);

        // Code thêm Tab 2 vào tabhost
        spec = tabhost.newTabSpec("Lazz Mail");
        spec.setContent(R.id.tab2);

        // setting the name of the tab 1 as "Tab Two"
        spec.setIndicator("Lazz Mail");
        tabhost.addTab(spec);

        // Code thêm Tab 3 vào  tabhost
        spec = tabhost.newTabSpec("Free Shipping");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Free Shipping");
        tabhost.addTab(spec);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}