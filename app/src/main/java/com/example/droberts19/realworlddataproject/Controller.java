package com.example.droberts19.realworlddataproject;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.ImageView;


public class Controller {

    private ImageView planets;
    private TabLayout tabs;
    private TabItem mercuryTab;
    private TabItem venusTab;
    private TabItem earthTab;


    Controller(ImageView PlanetPics, TabLayout Tabs, TabItem TI1, TabItem TI2, TabItem TI3, final Context c) {
        planets = PlanetPics;
        tabs = Tabs;
        mercuryTab = TI1;
        venusTab = TI2;
        earthTab = TI3;

        //TabLayout tabs = new TabLayout(c);
        //tabs.addTab(tabs.newTab().setText("Mercury"));
        mercuryTab.setOn
        venusTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                planets.setImageResource(R.drawable.venus);
            }
        });
        earthTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                planets.setImageResource(R.drawable.earth);
            }
        });
    }
}
