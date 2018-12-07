package com.example.droberts19.realworlddataproject;

class Planet {
    private String title;
    private String mass;
    private String diameter;
    private String density;
    private String gravity;

    Planet(String planetData) {
        String[] info = planetData.split("\\t+", 6);
        title = info[0];
        mass = info[1];
        diameter = info[2];
        density = info[3];
        gravity = info[4];
    }

    String getTitle() {
        return "Planet: " + title;
    }

    String getMass() {
        return "Mass: " + mass + " 10^(24) kg";
    }

    String getDiameter() {
        return "Diameter: " + diameter + " km";
    }

    String getDensity() {
        return "Density: " + density + " kg/m^(3)";
    }

    String getGravity() {
        return "Gravity: " + gravity + " m/s^(2)";
    }
}
