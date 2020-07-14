package com.tutorial.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class BackgroundChangeColorActivity extends AppCompatActivity {

    ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_background_activity);

        background = findViewById(R.id.bgtc);
        Timer timer = new Timer();
        MyTimer mytimer = new MyTimer();
        timer.schedule(mytimer,2000,2000);
    }

    private class MyTimer extends TimerTask {
        @Override
        public void run(){
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Random random = new Random();
                    background.setBackgroundColor(Color.rgb(255,
                            random.nextInt(256),
                            random.nextInt(256)));
                }
            });
        }
    }

    public void lastAnimationDrawableActivity(View view) {
            Intent i = new Intent(this, AnimationDrawableActivity.class);
            startActivity(i);
        }

        public void nextVectorAnimationDrawableActivity(View view) {
            Intent i = new Intent(this, VectorAnimationDrawableActivity.class);
            startActivity(i);
    }
}
