package com.mycompany.main;

public class Aereo {

    private String nombre;
    private String velocidad;

    public Aereo(String nombre, String velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public void info() {
        System.out.println("el " + nombre + " esta viajando a una velocidad de: " + velocidad);
    }

}
