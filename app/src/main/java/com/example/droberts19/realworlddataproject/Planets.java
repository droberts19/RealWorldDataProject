package com.example.droberts19.realworlddataproject;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Planets implements Model {
    private ArrayList<Planet> planets;
    private int current;

    // Constructor
    Planets (Context context) {
        current = 0;
        planets = new ArrayList();

        // Read planet data from text file.
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

    // Interface methods
    public void next() {
        // increment current to point to next pet
        if (current < planets.size() - 1) {
            current = current + 1;
        } else {
            current = 0;
        }
    }

    public void previous() {
        // increment current to point to previous pet
        if (current > 0) {
            current = current - 1;
        } else {
            current = planets.size() - 1;
        }
    }

    public String countText() {
        return "Planet" + (current+1) + " of " + planets.size();
    }

    public String titleText() {
        return planets.get(current).title();
    }

    public String descriptionText() {
        return planets.get(current).description();
    }
}
