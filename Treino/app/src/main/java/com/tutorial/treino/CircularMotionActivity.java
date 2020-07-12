package com.tutorial.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;



public class CircularMotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circular_motion_activity);
    }

    public void start(View view) {
        ImageView image = findViewById(R.id.imageAndroid);
        startAnimation(image);
    }

    public void startAnimation(View view) {
        Animation anim = new MyAnimation(view, 300);
        anim.setDuration(3000);
        view.startAnimation(anim);
    }

    public void lastDynamicImgViewActivity(View view) {
        Intent i = new Intent(this, DynamicImgViewActivity.class);
        startActivity(i);
    }

    public void nextAnimationDrawableActivity(View view) {
        Intent i = new Intent(this, AnimationDrawableActivity.class);
        startActivity(i);
    }


}
