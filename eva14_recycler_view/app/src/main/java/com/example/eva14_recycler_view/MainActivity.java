package com.example.eva14_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcVwLista;

    String[] aDatos;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcVwLista = findViewById(R.id.rcVwLista);

    }
    public void llenar(){

        args=new String[100];
        for (int i =0; i<100; i++){
            args[i]= "Elemento no. " + i;

        }
    }


}