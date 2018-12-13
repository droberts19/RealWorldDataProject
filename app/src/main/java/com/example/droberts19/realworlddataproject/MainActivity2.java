package com.example.droberts19.realworlddataproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private Controller controller1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView iv2 = findViewById(R.id.imageViewer2);
        Button earth1 = findViewById(R.id.earth1);
        Button jupiter1 = findViewById(R.id.jupiter1);
        Button mars1 = findViewById(R.id.mars1);
        Button mercury1 = findViewById(R.id.mercury1);
        Button neptune1 = findViewById(R.id.neptune1);
        Button saturn1 = findViewById(R.id.saturn1);
        Button uranus1 = findViewById(R.id.uranus1);
        Button venus1 = findViewById(R.id.venus1);

        controller1 = new Controller(iv2, earth1, jupiter1, mars1, mercury1, neptune1, saturn1, uranus1, venus1, this);
    }
}
