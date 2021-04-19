package com.example.eva1_4_findview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textVwMensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //conectar variable con el widget


        textVwMensaje = findViewById(R.id.txtVwMensaje);
        textVwMensaje.setText("Hola mundo");


    }
}