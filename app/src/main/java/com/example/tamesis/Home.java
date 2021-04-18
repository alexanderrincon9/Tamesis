package com.example.tamesis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ArrayList<Turismo> listaDeDatos = new ArrayList<>();
    RecyclerView listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listado = findViewById(R.id.listado);
        listado.setHasFixedSize(true);
        listado.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        crearListado();
        AdaptadorLista adaptador = new AdaptadorLista(listaDeDatos);
        listado.setAdapter(adaptador);

    }

    private void crearListado() {

        listaDeDatos.add(new Turismo(
                "GASTRONOMIA",
                getString(R.string.descripciongastronomia),
                R.drawable.imggastronomia



        ));
        listaDeDatos.add(new Turismo(
                "AVENTURA",
                getString(R.string.descripcionaventura),
                R.drawable.imgaventura


        ));
        listaDeDatos.add(new Turismo(
                "HOSPEDAJE",
                getString(R.string.descripcionhospedaje),
                R.drawable.imghospedaje


        ));
        listaDeDatos.add(new Turismo(
                "CULTURA",
                getString(R.string.descripcioncultura),
                R.drawable.imgcultura


        ));


    }

}
