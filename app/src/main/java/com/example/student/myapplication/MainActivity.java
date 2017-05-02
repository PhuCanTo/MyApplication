package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AppetizerClick(View view) {
        Toast.makeText(MainActivity.this, "Fried Shrimps!",
                Toast.LENGTH_LONG).show();
    }

    public void SaladClick(View view) {
        Toast.makeText(MainActivity.this, "Mixed Vegetables!",
                Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "Vegetarian Vegetables",
                Toast.LENGTH_LONG).show();
    }

    public void PastaClick(View view) {
        Toast.makeText(MainActivity.this, "Vegetarian Lasagna!",
                Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "Vegetarian Noodle",
                Toast.LENGTH_LONG).show();
    }

}
