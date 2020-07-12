package com.tutorial.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DynamicImgViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamic_imageview_activity);

        final ImageView green = findViewById(R.id.imageBack);
        final ImageView blue = findViewById(R.id.imageBack2);
        final ImageView red = findViewById(R.id.imageBack3);

        ValueAnimator animator = ValueAnimator.ofFloat(0f,1f);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                //blue.setAlpha((Float) animation.getAnimatedValue());
                red.setAlpha((Float) animation.getAnimatedValue());
            }
        });

        ValueAnimator animator2 = ValueAnimator.ofFloat(0f,1f);
        animator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                blue.setAlpha((Float) animation.getAnimatedValue());
                //red.setAlpha((Float) animation.getAnimatedValue());
            }
        });

        animator.setDuration(1500);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(-1);
        animator.start();

        animator2.setDuration(2500);
        animator2.setRepeatMode(ValueAnimator.REVERSE);
        animator2.setRepeatCount(-1);
        animator2.start();
    }

    public void lastShowUpSceneCompositionActivity(View view) {

        Intent i = new Intent(this, ShowUpText_SceneCompositionActivity.class);
        startActivity(i);
    }

    public void nextCircularMotionActivity(View view) {

        Intent i = new Intent(this, CircularMotionActivity.class);
        startActivity(i);
    }
}
