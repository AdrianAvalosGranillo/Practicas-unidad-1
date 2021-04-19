package com.example.eva1_5_findview_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgVwMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TIENE QUE SER DESPUES DEL SETCONTIENTVIEW
        imgVwMostrar= findViewById(R.id.imgVwMostrar);

        //YA PODEMOS USAR EL COMPONENTE
        imgVwMostrar.setImageResource(R.drawable.comida);
    }
}