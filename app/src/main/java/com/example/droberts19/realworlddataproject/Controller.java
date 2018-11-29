package com.example.droberts19.realworlddataproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.widget.ImageView;
import java.io.File;


public class Controller {

    private ImageView planets;
    private TabLayout tabs;
    private TabItem mercuryTab;
    private TabItem venusTab;
    private TabItem earthTab;

    Controller(ImageView PlanetPics, TabLayout Tabs, TabItem Merc, TabItem Venus, TabItem Earth, final Context c) {
        planets = PlanetPics;
        tabs = Tabs;
        mercuryTab = Merc;
        venusTab = Venus;
        earthTab = Earth;

        mercuryTab.setOn
        planets.setImageResource(R.drawable.earth);
    }
}
