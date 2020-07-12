package com.tutorial.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AnimationDrawableActivity extends AppCompatActivity {

    AnimationDrawable myAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_drawnable);

        ImageView myImage = (ImageView) findViewById(R.id.drawable_test_tutorial);
        //myImage.setBackgroundResource(R.drawable.drawable_test);
        //myAnimation = (AnimationDrawable) myImage.getBackground();
        myImage.setImageResource(R.drawable.drawable_test);
        myAnimation = (AnimationDrawable) myImage.getDrawable();

        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myAnimation.start();
            }
        });

        // Em um ImageView, existe diferença entre a Imagem e o Background
        // Para Configurar a imagem você deve utilizar setImageResource();
        // Para Configurar o background você deve utilizar setBackgroundResource();
        // Para acionar/modificar/pegar a Imagem pode ser utilizado getDrawable();
        // Para acionar/modificar/pegar o background pode ser utilizado getBackground();

    }

    public void lastCircularMotionActivity(View view) {
        Intent i = new Intent(this, CircularMotionActivity.class);
        startActivity(i);
    }

    public void nextBackgroundChangeColorActivity(View view) {
        Intent i = new Intent(this, BackgroundChangeColorActivity.class);
        startActivity(i);
    }
}
