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
                getString(R.string.descripcionrestaurante),
                getString(R.string.nombrerestaurante),
                getString(R.string.ubicacionrestaurante),
                getString(R.string.nombrerestaurante1),
                getString(R.string.descripcionrestaurante1),
                getString(R.string.ubicacionrestaurante1),
                R.drawable.imggastromain,
                R.drawable.imgrestauranteeeee,
                R.drawable.imgrestaurante1
        ));
        listaDeDatos.add(new Turismo(
                "AVENTURA",
                getString(R.string.descripcionaventura),
                getString(R.string.descripciorapelescalada),
                getString(R.string.nombreaventura),
                getString(R.string.ubicacionaventura),
                getString(R.string.nombreaventura1),
                getString(R.string.descripcioorganal),
                getString(R.string.ubicacioaventura1),
                R.drawable.imgaventura,
                R.drawable.imgaventuramain,
                R.drawable.imgaventura1
        ));
        listaDeDatos.add(new Turismo(
                "HOSPEDAJE",
                getString(R.string.descripcionhospedaje),
                getString(R.string.descripcionhospedaje1),
                getString(R.string.nombrehospedaje),
                getString(R.string.ubicacionhospedaje),
                getString(R.string.nombrehospedaje1),
                getString(R.string.descripcionhospedaje2),
                getString(R.string.ubicacionhospedaje1),
                R.drawable.imghospedaje,
                R.drawable.imghospedajemain,
                R.drawable.imghospedaje1
        ));
        listaDeDatos.add(new Turismo(
                "CULTURA",
                getString(R.string.descripcioncultura),
                getString(R.string.descripcionpetrogrifos),
                getString(R.string.nombrecultura),
                getString(R.string.ubicacioncultura),
                getString(R.string.nombrecultura1),
                getString(R.string.descripcionpcasacultura),
                getString(R.string.ubicacioncultura1),
                R.drawable.imgcultura,
                R.drawable.imgculturamain,
                R.drawable.imgcultura1


        ));


    }

}
