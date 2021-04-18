package com.example.tamesis;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Turismo implements Serializable {

    String tituloItemLista, descripcionItemLista;
    int imagenItemLista;

    public Turismo(String tituloItemLista, String descripcionItemLista, int imagenItemLista) {
        this.tituloItemLista = tituloItemLista;
        this.descripcionItemLista = descripcionItemLista;
        this.imagenItemLista = imagenItemLista;
    }

    public String getTituloItemLista() {
        return tituloItemLista;
    }

    public void setTituloItemLista(String tituloItemLista) {
        this.tituloItemLista = tituloItemLista;
    }

    public String getDescripcionItemLista() {
        return descripcionItemLista;
    }

    public void setDescripcionItemLista(String descripcionItemLista) {
        this.descripcionItemLista = descripcionItemLista;
    }

    public int getImagenItemLista() {
        return imagenItemLista;
    }

    public void setImagenItemLista(int imagenItemLista) {
        this.imagenItemLista = imagenItemLista;
    }
}