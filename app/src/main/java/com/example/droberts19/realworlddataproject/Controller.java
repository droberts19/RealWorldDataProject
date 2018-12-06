package com.example.droberts19.realworlddataproject;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class Controller {

    private ImageView planets;
    private TabLayout tabs;
    private TextView massText;
    private TextView diameterText;
    private TextView densityText;
    private TextView gravityText;
    private TextView titleText;

    private Model planetsData;

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

        planetsData = new Planets(c);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    planets.setImageResource(R.drawable.mercury);
                    updateText();
                }
                if (position == 1) {
                    planets.setImageResource(R.drawable.venus);
                    updateText();
                }
                if (position == 2) {
                    planets.setImageResource(R.drawable.earth);
                    updateText();
                }
                if (position == 3) {
                    planets.setImageResource(R.drawable.mars);
                    updateText();
                }
                if (position == 4) {
                    planets.setImageResource(R.drawable.jupiter);
                    updateText();
                }
                if (position == 5) {
                    planets.setImageResource(R.drawable.saturn);
                    updateText();
                }
                if (position == 6) {
                    planets.setImageResource(R.drawable.uranus);
                    updateText();
                }
                if (position == 7) {
                    planets.setImageResource(R.drawable.neptune);
                    updateText();
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

    private void updateText() {
        titleText.setText("Planets: " + planetsData.titleTexts());
        massText.setText("Mass: " + planetsData.massTexts());
        diameterText.setText("Diameter: " + planetsData.diameterTexts());
        densityText.setText("Density: " + planetsData.densityTexts());
        gravityText.setText("Gravity: " + planetsData.gravityTexts());
    }
}
