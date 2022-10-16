package com.example.capsulas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttonST;
    private Button buttonEN;

    CardView cardControlador;
    CardView cardAjustes;
    CardView cardStats;
    CardView cardEnergia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        buttonST = (Button) findViewById(R.id.buttonST);
        buttonST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });

        buttonEN = (Button) findViewById(R.id.buttonEN);
        buttonEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        cardControlador = findViewById(R.id.cardControlador);
        cardAjustes = findViewById(R.id.cardAjustes);
        cardStats = findViewById(R.id.cardStats);
        cardEnergia = findViewById(R.id.cardEnergia);

        cardControlador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Controlador Clickeado");

            }
        });
        cardAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Ajustes Clickeado");
            }
        });
        cardStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Estadisticas Clickeado");
            }
        });
        cardEnergia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Energia Clickeado");
            }
        });

    }

    private void showToast(String message){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();;
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}