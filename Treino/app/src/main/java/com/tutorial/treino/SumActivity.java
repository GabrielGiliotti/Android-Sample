package com.tutorial.treino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Type;

public class SumActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.tutorial.treino.MESSAGE";
    private EditText firstNumber;
    private EditText secondNumber;
    private TextView resultNumber;
    private int firstField;

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

        int firstField = 0;
        int secondField = 0;
        try
        {
            firstField = Integer.parseInt(firstNumber.getText().toString());
        }
        catch (Exception ex)
        {
            System.out.println("Invalid Value: " + ex);
        }

        try
        {
            secondField = Integer.parseInt(secondNumber.getText().toString());
        }
        catch (Exception ex)
        {
            System.out.println("Invalid Value: " + ex);
        }

        try
        {
            int resultado = firstField + secondField;
            resultNumber.setText("Valor calculado: " + resultado);
        }
        catch (Exception ex)
        {
            System.out.println("Invalid Sum: " + ex);
        }
    }
}
