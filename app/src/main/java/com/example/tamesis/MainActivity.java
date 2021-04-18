package com.example.tamesis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tituloTurismo,descripcionTurismo;
    ImageView imagenTurismo;

    Turismo turismo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tituloTurismo=findViewById(R.id.tituloTurismo);
        descripcionTurismo=findViewById(R.id.descripcionTurismo);
        imagenTurismo=findViewById(R.id.imagenTurismo);



        turismo =(Turismo) getIntent().getSerializableExtra("turismo");



        tituloTurismo.setText(turismo.getTituloItemLista());
        descripcionTurismo.setText(turismo.getDescripcionItemLista());
        imagenTurismo.setImageResource(turismo.getImagenItemLista());









    }
}