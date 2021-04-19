package com.example.eva1_13_cuadros_dialogos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCSistema (View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo de Android")
                .setMessage("Hola mundo!")
                .setPositiveButton(textld: "ok", )
        new DialogInterface.OnCancelListener(){
            
        }


    }
    public void onClickCDCustom(View v){

    }

}