package com.example.droberts19.realworlddataproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Controller control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = findViewById(R.id.imageViewer);

        control = new Controller(iv, getApplicationContext());
    }

    @Override
    protected void onStop() {
        //control.save();
        super.onStop();
    }
}
