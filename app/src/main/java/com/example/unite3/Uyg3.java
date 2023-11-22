package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg3);

        char karakter = 'a';
        System.out.println("Karakter: " + karakter);
        karakter = 'a' + 1;
        System.out.println("Karakter: " + karakter);
    }
}