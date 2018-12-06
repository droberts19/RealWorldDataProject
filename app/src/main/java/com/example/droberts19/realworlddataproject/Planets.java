package com.example.droberts19.realworlddataproject;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Planets implements Model {
    private ArrayList<Planet> planets;
    private int current;

    Planets (Context context) {
        current = 0;
        planets = new ArrayList();


        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("Data")));
            String nextLine;
            while ((nextLine = bufferedReader.readLine()) != null) {
                planets.add(new Planet(nextLine));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Planets() reading data threw exception:");
            e.printStackTrace();
        }
    }

    public String titleTexts() {
        return planets.get(current).getTitle();
    }

    public String massTexts() {
        return planets.get(current).getMass();
    }

    public String diameterTexts() {
        return planets.get(current).getDiameter();
    }

    public String densityTexts() {
        return planets.get(current).getDensity();
    }

    public String gravityTexts() {
        return planets.get(current).getGravity();
    }
}
