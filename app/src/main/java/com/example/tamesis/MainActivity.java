package com.example.tamesis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tituloTurismo,descripcionTurismo,ubicacion,tituloTurismo1,descripcionTurismo1,ubicacion1;
    ImageView imagenTurismo,imagenTurismo1;

    Turismo turismo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        descripcionTurismo=findViewById(R.id.descripcionTurismo);
        imagenTurismo=findViewById(R.id.imagenTurismo);
        tituloTurismo=findViewById(R.id.tituloTurismo);
        ubicacion=findViewById(R.id.ubicacion);
        tituloTurismo1=findViewById(R.id.tituloTurismo1);
        imagenTurismo1=findViewById(R.id.imagenTurismo1);
        descripcionTurismo1=findViewById(R.id.descripcionTurismo1);
        ubicacion1=findViewById(R.id.ubicacion1);


        turismo =(Turismo) getIntent().getSerializableExtra("turismo");


        imagenTurismo.setImageResource(turismo.getImagenTurismo());
        descripcionTurismo.setText(turismo.getDescripcionturismo());
        tituloTurismo.setText(turismo.getTituloTurismo());
        ubicacion.setText(turismo.getUbicacion());
        tituloTurismo1.setText(turismo.getTituloTurismo1());
        imagenTurismo1.setImageResource(turismo.getImagenTurismo1());
        descripcionTurismo1.setText(turismo.getDescripcionTurismo1());
        ubicacion1.setText(turismo.getUbicacion1());









    }
}