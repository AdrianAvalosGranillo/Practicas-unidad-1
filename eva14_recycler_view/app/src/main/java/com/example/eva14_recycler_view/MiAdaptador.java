package com.example.eva14_recycler_view;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MiAdaptador extends RecyclerView.Adapter <MiAdaptador.ViewHolder> {

    private String[] aDatos;


    public MiAdaptador(String[] aDatos) {
        this.aDatos = aDatos;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView txtVwfila;
        public TextView getTxtVwfila() {

        }





        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtVwfila = itemView.findViewById(R.id.txtVwFila);
            
        }
    }
}
