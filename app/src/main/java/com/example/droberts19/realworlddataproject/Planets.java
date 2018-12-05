package com.example.droberts19.realworlddataproject;

import android.provider.ContactsContract;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Planets implements Model {
    private ArrayList<Planet> Planets;
    private int current;


    Planets(Context context) {
        current = 0;
        Planets = new ArrayList();

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open()));
            String nextLine;
            while ((nextLine = bufferedReader.readLine()) != null) {
                Planets.add(new Planet(nextLine));
            }
            bufferedReader.close();
        }catch(Exception e) {
            System.out.println("Planets() reading data threw exception:");
            e.printStackTrace();
            }
        }
    public String titleText() {
        return Planets.get(current).title();
    }

    public String descriptionText() {
        return Planets.get(current).description();
    }
}
