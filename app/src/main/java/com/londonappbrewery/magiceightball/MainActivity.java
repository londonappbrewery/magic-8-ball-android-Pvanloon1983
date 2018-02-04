package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall); // this is how you make a variable

        final int[] ballArray = new int[] { // this is how you make an array (like a variable but with multiple things in it)
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        Button myButton = (Button) findViewById(R.id.askButton); // This is how you make a variable for a button

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                int imageResourceId = ballArray[number];

                ballDisplay.setImageResource(imageResourceId);


            }
        });


    }
}
