package com.example.droberts19.realworlddataproject;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Controller control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = findViewById(R.id.imageViewer);
        TabLayout tb = findViewById(R.id.tabs);
        TabItem ti1 = findViewById(R.id.mercruyTab);
        TabItem ti2 = findViewById(R.id.venusTab);
        TabItem ti3 = findViewById(R.id.earthTab);

        control = new Controller(iv, tb, ti1, ti2, ti3, getApplicationContext());
    }

    @Override
    protected void onStop() {
        //control.save();
        super.onStop();
    }
}
