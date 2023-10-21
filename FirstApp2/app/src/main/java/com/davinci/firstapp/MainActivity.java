package com.davinci.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

import animal.Cat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "EMA->LOG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout content = findViewById(R.id.content);
        content.setBackgroundColor(+R.color.black);

        Button primerBoton = new Button(this);
        primerBoton.setText("hola mundo, soy boton");

        content.addView(primerBoton);
    }
}