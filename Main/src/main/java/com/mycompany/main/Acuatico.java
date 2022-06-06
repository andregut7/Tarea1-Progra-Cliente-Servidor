package com.mycompany.main;

public class Acuatico {

    private String tipo;
    private String velocidad;
    private int capacidad;

    public Acuatico(String tipo, String velocidad, int capacidad) {
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void navegar() {
        System.out.println(" El/La " + tipo + " esta navengando a una velocidad de " + velocidad + " por el oceano");
    }

}
