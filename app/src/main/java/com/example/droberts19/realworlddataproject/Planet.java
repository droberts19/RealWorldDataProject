package com.example.droberts19.realworlddataproject;

import java.util.Scanner;

class Planet {
    public String title;
    private String mass;
    private String diameter;
    private String density;
    private String gravity;

    Planet(String planetsData) {
        String[] info = planetsData.split("\\t+", 8);
        title = info[0];
        mass = info[1];
        diameter = info[2];
        density = info[3];
        gravity = info[4];
    }

    String getTitle() {
        return title;
    }

    String getMass() {
        return mass;
    }

    String getDiameter() {
        return diameter;
    }

    String getDensity() {
        return density;
    }

    String getGravity() {
        return gravity;
    }
}
