package com.mycompany.main;

public class Vehiculo {

    private int cantLlantas;
    private int asientos;
    private String color;

    public Vehiculo(int cantLlantas, int asientos, String color) {
        this.cantLlantas = cantLlantas;
        this.asientos = asientos;
        this.color = color;
    }

    public int getCantLlantas() {
        return cantLlantas;
    }

    public void setCantLlantas(int cantLlantas) {
        this.cantLlantas = cantLlantas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void informacion() {
        System.out.println("El vehiculo tiene " + cantLlantas + " llantas y es de color: " + color);
    }
}
