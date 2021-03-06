package com.example.droberts19.realworlddataproject;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Controller controller2;
    private int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = findViewById(R.id.imageViewer);
        TextView tv1 = findViewById(R.id.massText);
        TextView tv2 = findViewById(R.id.diameterText);
        TextView tv3 = findViewById(R.id.densityText);
        TextView tv4 = findViewById(R.id.gravityText);
        TextView tv5 = findViewById(R.id.titleText);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Controller.no);

        controller2 = new Controller(iv, tv1, tv2, tv3, tv4, tv5, getApplicationContext(), message);
    }
}
