package com.tutorial.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChangeTextActivity extends AppCompatActivity {
    private TextView about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_text_activity);

        about = findViewById(R.id.textView2);
    }

    public void aboutThePage(View view) {
        TextView novoTexto = findViewById(about.getId());
        novoTexto.setText("Pagina criada para treinar mudanças entre Activitys no Android");
    }

    public void lastSumActivity(View view) {
        Intent i = new Intent(this, SumActivity.class);
        startActivity(i);
    }

    public void nextShowUpSceneCompositionActivity(View view) {
        Intent i = new Intent(this, ShowUpText_SceneCompositionActivity.class);
        startActivity(i);
    }
}
