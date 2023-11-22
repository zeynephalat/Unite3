package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg2);

        super.onCreate(savedInstanceState);
        byte kucuksayi = 127;
        short kisasayi = 32767;
        int tamsayi = 2147483647;
        long uzunsayi = 9223372036854775807L;
        System.out.println(("byte:" + kucuksayi));
        System.out.println(("short:" + kisasayi ));
        System.out.println(("int:" + tamsayi));
        System.out.println(("long:" + uzunsayi));
    }
}