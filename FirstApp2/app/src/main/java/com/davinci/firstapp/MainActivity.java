package com.davinci.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import animal.Cat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "EMA->LOG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat michi = new Cat("pepe","miu");
        Log.d(TAG, michi.greet());
    }
}