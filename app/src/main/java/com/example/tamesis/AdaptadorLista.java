package com.example.tamesis;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.viewHolder> {

    ArrayList<Turismo> listaDeDatos;

    public AdaptadorLista(ArrayList<Turismo> listaDeDatos) {

        this.listaDeDatos = listaDeDatos;
    }

    @NonNull
    @Override
    public AdaptadorLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaListado= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_de_lista,null,false);
        return new viewHolder(vistaListado);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.viewHolder holder, int position) {
        holder.actualizarDatos(listaDeDatos.get(position));

    }

    @Override
    public int getItemCount() {
        return listaDeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView tituloItemLista,descripcionItemLista;
        ImageView imagenItemLista;


        public viewHolder(@NonNull View itemView) {
            super(itemView);


            tituloItemLista = itemView.findViewById(R.id.tituloItemLista);
            imagenItemLista = itemView.findViewById(R.id.imagenItemLista);
            descripcionItemLista=itemView.findViewById(R.id.descripcionItemLista);




        }

            public void actualizarDatos ( Turismo datos) {

                tituloItemLista.setText(datos.getTituloItemLista());
                imagenItemLista.setImageResource(datos.getImagenItemLista());
                descripcionItemLista.setText(datos.getDescripcionItemLista());



                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent(itemView.getContext(),MainActivity.class);
                        intent.putExtra("turismo",datos);
                        itemView.getContext().startActivity(intent);

                    }
                });



            }

        }
    }

