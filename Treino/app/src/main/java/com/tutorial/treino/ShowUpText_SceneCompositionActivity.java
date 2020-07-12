package com.tutorial.treino;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;


public class ShowUpText_SceneCompositionActivity extends AppCompatActivity {

    boolean show1;
    boolean show2;
    FrameLayout sceneRoot1;
    FrameLayout sceneRoot2;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showup_text_activity);

        sceneRoot1 = findViewById(R.id.scene_root1);
        sceneRoot1.setVisibility(View.INVISIBLE);
        sceneRoot2 = findViewById(R.id.scene_root2);
        sceneRoot2.setVisibility(View.INVISIBLE);
        show1 = false;
        show2 = false;
    }

    public void firstSceneAction(View v) {
        if(!show1){
            sceneRoot1.setVisibility(View.VISIBLE);
            show1 = true;
        }else{
            sceneRoot1.setVisibility(View.INVISIBLE);
            show1 = false;
        }
    }

    public void secondSceneAction(View v) {
        if(!show2){
            sceneRoot2.setVisibility(View.VISIBLE);
            show2 = true;
        }else{
            sceneRoot2.setVisibility(View.INVISIBLE);
            show2 = false;
        }
    }

    public void lastChangeTextActivity(View view) {
        Intent i = new Intent(this, ChangeTextActivity.class);
        startActivity(i);
    }

    public void nextDynamicImgViewActivity(View view) {
        Intent i = new Intent(this, DynamicImgViewActivity.class);
        startActivity(i);
    }

}
