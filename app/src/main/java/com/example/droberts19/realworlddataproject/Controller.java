package com.example.droberts19.realworlddataproject;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Controller {

    private ImageView planets;
    private TabLayout tabs;
    private TextView massText;
    private TextView diameterText;
    private TextView densityText;
    private TextView gravityText;
    private TextView titleText;

    Controller(ImageView PlanetPics, TabLayout Tabs, TextView TV1, TextView TV2,
               TextView TV3, TextView TV4, TextView TV5, final Context c) {
        planets = PlanetPics;
        tabs = Tabs;
        massText = TV1;
        diameterText = TV2;
        densityText = TV3;
        gravityText = TV4;
        titleText = TV5;

        tabs.addTab(tabs.newTab().setText("1"));
        tabs.addTab(tabs.newTab().setText("2"));
        tabs.addTab(tabs.newTab().setText("3"));
        tabs.addTab(tabs.newTab().setText("4"));
        tabs.addTab(tabs.newTab().setText("5"));
        tabs.addTab(tabs.newTab().setText("6"));
        tabs.addTab(tabs.newTab().setText("7"));
        tabs.addTab(tabs.newTab().setText("8"));

        planets.setImageResource(R.drawable.mercury);
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    planets.setImageResource(R.drawable.mercury);
                }
                if (position == 1) {
                    planets.setImageResource(R.drawable.venus);
                }
                if (position == 2) {
                    planets.setImageResource(R.drawable.earth);
                }
                if (position == 3) {
                    planets.setImageResource(R.drawable.mars);
                }
                if (position == 4) {
                    planets.setImageResource(R.drawable.jupiter);
                }
                if (position == 5) {
                    planets.setImageResource(R.drawable.saturn);
                }
                if (position == 6) {
                    planets.setImageResource(R.drawable.uranus);
                }
                if (position == 7) {
                    planets.setImageResource(R.drawable.neptune);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                planets.clearAnimation();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
