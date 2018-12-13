package com.example.droberts19.realworlddataproject;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.Button;
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

    private ImageView solarSystem;
    private Button earth1;
    private Button jupiter1;
    private Button mars1;
    private Button mercury1;
    private Button neptune1;
    private Button saturn1;
    private Button uranus1;
    private Button venus1;
    private MainActivity2 activity;

    Controller(final ImageView SS, Button e, Button j, Button m1, Button m2, Button n, Button s, Button u, Button v, MainActivity2 ma2) {
        solarSystem = SS;
        earth1 = e;
        jupiter1 = j;
        mars1 = m1;
        mercury1 = m2;
        neptune1 = n;
        saturn1 = s;
        uranus1 = u;
        venus1 = v;
        activity = ma2;

        mercury1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto();
            }
        });

        venus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto();
            }
        });

        earth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto();
            }
        });

        mars1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto();
            }
        });

        jupiter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto();
            }
        });

        saturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto();
            }
        });

        uranus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto();
            }
        });

        neptune1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto();
            }
        });
    }

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
        updateText();

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    planets.setImageResource(R.drawable.mercury);
                    setMercury1();
                    updateText();
                }
                if (position == 1) {
                    planets.setImageResource(R.drawable.venus);
                    setVenus1();
                    updateText();
                }
                if (position == 2) {
                    planets.setImageResource(R.drawable.earth);
                    setEarth1();
                    updateText();
                }
                if (position == 3) {
                    planets.setImageResource(R.drawable.mars);
                    setMars1();
                    updateText();
                }
                if (position == 4) {
                    planets.setImageResource(R.drawable.jupiter);
                    setJupiter1();
                    updateText();
                }
                if (position == 5) {
                    planets.setImageResource(R.drawable.saturn);
                    setSaturn1();
                    updateText();
                }
                if (position == 6) {
                    planets.setImageResource(R.drawable.uranus);
                    setUranus1();
                    updateText();
                }
                if (position == 7) {
                    planets.setImageResource(R.drawable.neptune);
                    setNeptune1();
                    updateText();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                planets.clearAnimation();
                planets.setImageResource(0);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void Switchto() {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
    }

    private void updateText() {
        titleText.setText(planetsData.titleTexts());
        massText.setText(planetsData.massTexts());
        diameterText.setText(planetsData.diameterTexts());
        densityText.setText(planetsData.densityTexts());
        gravityText.setText(planetsData.gravityTexts());
    }

    private void setMercury1() {
        planetsData.setMercury();
    }

    private void setVenus1() {
        planetsData.setVenus();
    }

    private void setEarth1() {
        planetsData.setEarth();
    }

    private void setMars1() {
        planetsData.setMars();
    }

    private void setJupiter1() {
        planetsData.setJupiter();
    }

    private void setSaturn1() {
        planetsData.setSaturn();
    }

    private void setUranus1() {
        planetsData.setUranus();
    }

    private void setNeptune1() {
        planetsData.setNeptune();
    }
}
