package com.example.tamesis;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Turismo implements Serializable {

    String tituloItemLista, descripcionItemLista, descripcionturismo,tituloTurismo,ubicacion,tituloTurismo1,descripcionTurismo1,ubicacion1;
    int imagenItemLista,imagenTurismo,imagenTurismo1;

    public Turismo (String tituloItemLista, String descripcionItemLista,
                   String descripcionturismo, String tituloTurismo, String ubicacion,
                   String tituloTurismo1, String descripcionTurismo1,String ubicacion1,
                   int imagenItemLista,int imagenTurismo, int imagenTurismo1) {

        this.tituloItemLista = tituloItemLista;
        this.descripcionItemLista = descripcionItemLista;
        this.imagenItemLista = imagenItemLista;
        this.tituloTurismo = tituloTurismo;
        this.descripcionturismo = descripcionturismo;
        this.ubicacion = ubicacion;
        this.tituloTurismo1 = tituloTurismo1;
        this.descripcionTurismo1 = descripcionTurismo1;
        this.ubicacion1 = ubicacion1;
        this.imagenTurismo = imagenTurismo;
        this.imagenTurismo1 = imagenTurismo1;
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

    public String getDescripcionturismo() {
        return descripcionturismo;
    }

    public void setDescripcionturismo(String descripcionturismo) {
        this.descripcionturismo = descripcionturismo;
    }

    public String getTituloTurismo() {
        return tituloTurismo;
    }

    public void setTituloTurismo(String tituloTurismo) {
        this.tituloTurismo = tituloTurismo;
    }

    public int getImagenTurismo() {
        return imagenTurismo;
    }

    public void setImagenTurismo(int imagenTurismo) {
        this.imagenTurismo = imagenTurismo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTituloTurismo1() {
        return tituloTurismo1;
    }

    public void setTituloTurismo1(String tituloTurismo1) {
        this.tituloTurismo1 = tituloTurismo1;
    }

    public int getImagenTurismo1() {
        return imagenTurismo1;
    }

    public void setImagenTurismo1(int imagenTurismo1) {
        this.imagenTurismo1 = imagenTurismo1;
    }

    public String getDescripcionTurismo1() {
        return descripcionTurismo1;
    }

    public void setDescripcionTurismo1(String descripcionTurismo1) {
        this.descripcionTurismo1 = descripcionTurismo1;
    }

    public String getUbicacion1() {
        return ubicacion1;
    }

    public void setUbicacion1(String ubicacion1) {
        this.ubicacion1 = ubicacion1;
    }
}