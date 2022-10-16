package com.example.capsulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Activity3 extends AppCompatActivity {
    private Button buttonRE;

    Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        buttonRE = (Button) findViewById(R.id.buttonRE);
        buttonRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });

        chronometer = findViewById(R.id.chronometer);

        findViewById(R.id.btninicio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.start();
            }
        });

        findViewById(R.id.btnstop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.stop();
            }
        });
    }

    public void openActivity5(){
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }
}