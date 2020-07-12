package com.tutorial.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.tutorial.treino.MESSAGE";
    private EditText firstNumber;
    private EditText secondNumber;
    private TextView resultNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sum_activity);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        resultNumber = findViewById(R.id.textoResultado);
    }

    public void nextChangeTextActivity(View view) {
        Intent i = new Intent(this, ChangeTextActivity.class);
        startActivity(i);
    }

    public void Soma(View view) {

        int resultado = Integer.parseInt(firstNumber.getText().toString()) +
                        Integer.parseInt(secondNumber.getText().toString());
        resultNumber.setText("Valor calculado: " + resultado);
    }

    //public void selecionarBotao(View v) {
    //    int resultado = new Random().nextInt(20);
    //    resultado += 1;
    //    TextView novoTexto = findViewById(R.id.textoResultado);
    //    novoTexto.setText("Resultado: " + resultado);
    //}
}
