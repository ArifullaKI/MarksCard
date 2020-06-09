package com.example.android.markscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView arif = (TextView) findViewById(R.id.arif);
        arif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arifIntent = new Intent(MainActivity.this,arif.class);
                startActivity(arifIntent);
            }
        });

        TextView aditya = (TextView) findViewById(R.id.aditya);
        aditya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adityaIntent = new Intent(MainActivity.this,aditya.class);
                startActivity(adityaIntent);
            }
        });

        TextView kartik = (TextView) findViewById(R.id.kartik);
        kartik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kartikIntent = new Intent(MainActivity.this,kartik.class);
                startActivity(kartikIntent);
            }
        });

         TextView mustafa = (TextView) findViewById(R.id.mustafa);
        mustafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mustafaIntent = new Intent(MainActivity.this,mustafa.class);
                startActivity(mustafaIntent);
            }
        });


    }
}
