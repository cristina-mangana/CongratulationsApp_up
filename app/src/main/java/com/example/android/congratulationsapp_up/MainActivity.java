package com.example.android.congratulationsapp_up;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set the font's path
        String fontPathCabinSketchB = "fonts/CabinSketch-Bold.ttf";
        String fontPathComingSoon = "fonts/ComingSoon.ttf";
        // Get the id TextView
        TextView textViewCongrats = (TextView) findViewById(R.id.congrats);
        TextView textViewExams = (TextView) findViewById(R.id.exams);
        TextView textViewAdventure = (TextView) findViewById(R.id.adventure);
        TextView textViewNow = (TextView) findViewById(R.id.now);
        // Load the font as a TypeFace object
        Typeface typeFaceCabinSketchB = Typeface.createFromAsset(getAssets(), fontPathCabinSketchB);
        Typeface typeFaceComingSoon = Typeface.createFromAsset(getAssets(), fontPathComingSoon);
        // Set the extra fancy font in the customFont TextView
        textViewCongrats.setTypeface(typeFaceCabinSketchB);
        textViewExams.setTypeface(typeFaceComingSoon);
        textViewAdventure.setTypeface(typeFaceComingSoon);
        textViewNow.setTypeface(typeFaceComingSoon);
    }
    //Change color randomly when clicking
    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
    //Function onClick
    public void animation (View view){
        TextView textViewAnimation = (TextView) findViewById(R.id.congrats);
        textViewAnimation.setTextColor(getRandomColor());
    }

}