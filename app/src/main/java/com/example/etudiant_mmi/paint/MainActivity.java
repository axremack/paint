package com.example.etudiant_mmi.paint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout scene = findViewById(R.id.scene);
        Dessin dessin = new Dessin(this);
        scene.addView(dessin);

        Ecouteur ecouteur = new Ecouteur();
        dessin.setOnTouchListener(ecouteur);
    }
}
