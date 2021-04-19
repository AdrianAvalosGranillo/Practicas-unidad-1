package com.example.eva1_9_ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
                                   //super clase
public class MainActivity extends AppCompatActivity {
/*FOREGROUND - FOCO - SON VISIBLES*/
    @Override  //
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();


    }


                                       @Override
                                       protected void onStart() {
                                           super.onStart();
                                           Toast.makeText(this, " onStart", Toast.LENGTH_SHORT).show();
                                       }

                                       @Override
                                       protected void onResume() {
                                           super.onResume();
                                           Toast.makeText(this, " onResume", Toast.LENGTH_SHORT).show();
                                       }
                                       /*BACKROUD - LOST FOCUS - NO VISIBLES/PARCIALMENTE VISIBLES*/

                                       @Override
                                       protected void onPause() {
                                           super.onPause();
                                           Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
                                       }

                                       @Override
                                       protected void onStop() {
                                           super.onStop();
                                           Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
                                       }

                                       @Override
                                       protected void onDestroy() {
                                           super.onDestroy();
                                           Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
                                       }
                                       //TRANSICION


                                       @Override
                                       protected void onRestart() {
                                           super.onRestart();
                                           Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
                                       }
                                   }