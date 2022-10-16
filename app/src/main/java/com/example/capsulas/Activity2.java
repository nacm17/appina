package com.example.capsulas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private Button button2;

    CardView cardArriba;
    CardView cardAbajo;
    CardView cardStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        cardArriba = findViewById(R.id.cardArriba);
        cardAbajo = findViewById(R.id.cardAbajo);
        cardStop = findViewById(R.id.cardStop);


        cardArriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Subiendo");
            }
        });

        cardAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Bajando");
            }
        });

        cardStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Deteniendo");
            }
        });

    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}