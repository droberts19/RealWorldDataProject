package com.example.droberts19.realworlddataproject;

import java.util.Scanner;

class Planet {
    public String title;
    private String mass;
    private String diameter;
    private String density;
    private String gravity;

    Planet(String planetData) {
        String[] info = planetData.split("\\t+", 8);
        title = info[0];
        mass = info[1];
        diameter = info[2];
        density = info[3];
        gravity = info[4];
    }



    String getData() {
        return mass + diameter + density + gravity;
    }
}
