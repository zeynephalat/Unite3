package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uyg1(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1.class);
        startActivity(i);
    }

    public void uyg2(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }

    public void uyg3(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3.class);
        startActivity(i);
    }

    public void uyg4(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4.class);
        startActivity(i);
    }

    public void uyg5(View view) {
        Intent i = new Intent(MainActivity.this, Uyg5.class);
        startActivity(i);
    }

    public void uyg6(View view) {
        Intent i = new Intent(MainActivity.this, Uyg6.class);
        startActivity(i);

    }

    public void uyg7(View view) {
        Intent i = new Intent(MainActivity.this, Uyg7.class);
        startActivity(i);

    }

    public void uyg8(View view) {
        Intent i = new Intent(MainActivity.this, Uyg8.class);
        startActivity(i);

    }

    public void uyg9(View view) {
        Intent i = new Intent(MainActivity.this, Uyg9.class);
        startActivity(i);
    }

    public void uyg10(View view) {
        Intent i = new Intent(MainActivity.this, Uyg10.class);
        startActivity(i);
    }

    public void uyg11(View view) {
        Intent i = new Intent(MainActivity.this, Uyg11.class);
        startActivity(i);
    }
}