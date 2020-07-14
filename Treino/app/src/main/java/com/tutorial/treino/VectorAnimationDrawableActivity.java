package com.tutorial.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VectorAnimationDrawableActivity extends AppCompatActivity {

    AnimationDrawable myAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_animation_drawable);

        ImageView myImage = (ImageView) findViewById(R.id.drawable_test_tutorial_2);
        //myImage.setBackgroundResource(R.drawable.drawable_test);
        //myAnimation = (AnimationDrawable) myImage.getBackground();
        myImage.setImageResource(R.drawable.drawable_test_2);
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

    public void lastBackgroundChangeColorActivity(View view) {
        Intent i = new Intent(this, BackgroundChangeColorActivity.class);
        startActivity(i);
    }

    public void next__Activity(View view) {
        Intent i = new Intent(this, VectorAnimationDrawableActivity.class);
        startActivity(i);
    }
}
