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
}
