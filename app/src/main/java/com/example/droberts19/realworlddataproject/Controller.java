package com.example.droberts19.realworlddataproject;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Controller {
    public static final String no = "no";

    private ImageView planets;
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

    Controller(final ImageView SS, Button e, Button j, Button m1, Button m2, Button n, Button s, final Button u, Button v, MainActivity2 ma2) {
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
                Switchto("m1");
            }
        });

        venus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto("v");
            }
        });

        earth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto("e");
            }
        });

        mars1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto("m2");
            }
        });

        jupiter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto("j");
            }
        });

        saturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto("s");
            }
        });

        uranus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto("u");
            }
        });

        neptune1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switchto("n");
            }
        });
    }

    Controller(ImageView PlanetPics, TextView TV1, TextView TV2,
               TextView TV3, TextView TV4, TextView TV5, final Context c, String msg) {
        planets = PlanetPics;
        massText = TV1;
        diameterText = TV2;
        densityText = TV3;
        gravityText = TV4;
        titleText = TV5;

        planetsData = new Planets(c);
        updateText();

        if (msg.equals("m1")) {
            planets.setImageResource(R.drawable.mercury);
            setMercury1();
            updateText();
        }
        if (msg.equals("v")) {
            planets.setImageResource(R.drawable.venus);
            setVenus1();
            updateText();
        }
        if (msg.equals("e")) {
            planets.setImageResource(R.drawable.earth);
            setEarth1();
            updateText();
        }
        if (msg.equals("m2")) {
            planets.setImageResource(R.drawable.mars);
            setMars1();
            updateText();
        }
        if (msg.equals("j")) {
            planets.setImageResource(R.drawable.jupiter);
            setJupiter1();
            updateText();
        }
        if (msg.equals("s")) {
            planets.setImageResource(R.drawable.saturn);
            setSaturn1();
            updateText();
        }
        if (msg.equals("u")) {
            planets.setImageResource(R.drawable.uranus);
            setUranus1();
            updateText();
        }
        if (msg.equals("n")) {
            planets.setImageResource(R.drawable.neptune);
            setNeptune1();
            updateText();
        }
    }

    private void Switchto(String planet) {
        Intent intent = new Intent(activity, MainActivity.class);
        intent.putExtra(no, planet);
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
