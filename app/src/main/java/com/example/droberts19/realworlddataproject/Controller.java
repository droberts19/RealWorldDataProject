package com.example.droberts19.realworlddataproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import java.io.File;


public class Controller {

    private ImageView planets;

    Controller(ImageView PlanetPics, final Context c) {
        planets = PlanetPics;

        planets.setImageResource(R.drawable.earth);
    }
}
