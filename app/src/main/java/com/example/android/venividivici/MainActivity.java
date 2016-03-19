package com.example.android.venividivici;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView nome;
    private Button bBiceps, bTriceps, bPernas, bPeitoral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (TextView) findViewById(R.id.textView_user);
        bBiceps = (Button) findViewById(R.id.button_biceps);
        bTriceps = (Button) findViewById(R.id.button_triceps);
        bPernas = (Button) findViewById(R.id.button_pernas);
        bPeitoral = (Button) findViewById(R.id.button_peitoral);
        nome.setText("Bem vindo \n"+getIntent().getExtras().getString("nome"));

        bBiceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBiceps = new Intent(MainActivity.this, BicepsActivity.class);
                startActivity(intentBiceps);
            }
        });
        bTriceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTriceps = new Intent(MainActivity.this, TricepsActivity.class);
                startActivity(intentTriceps);
            }
        });
        bPernas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPernas = new Intent(MainActivity.this, PernasActivity.class);
                startActivity(intentPernas);
            }
        });
        bPeitoral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPeitoral = new Intent(MainActivity.this, PeitoralActivity.class);
                startActivity(intentPeitoral);
            }
        });
    }

}
