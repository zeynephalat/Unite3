package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg6);

        final int PI = 3;
        int yariCap = 4;
        int cevre = (2 * yariCap * PI);
        System.out.println("çevre  " + cevre);

    }
}