package com.mycompany.main;

public class Barco {

    private String color;
    private Acuatico datos;

    public Barco(Acuatico datos) {
        this.datos = datos;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Acuatico getDatos() {
        return datos;
    }

    public void setDatos(Acuatico datos) {
        this.datos = datos;
    }

    public void izarVelas() {
        System.out.println("el barco esta izando las velas");
    }

}
