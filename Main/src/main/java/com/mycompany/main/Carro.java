package com.mycompany.main;

public class Carro extends Terrestre {

    private int cilindraje;
    private int pasajeros;
    private String marca;

    public Carro(int cantLlantas, int asientos, String color, String tipoVehiculo, int cilindraje, int pasajeros, String marca) {
        super(cantLlantas, asientos, color, tipoVehiculo);
        this.cilindraje = cilindraje;
        this.pasajeros = pasajeros;
        this.marca = marca;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void arrancar() {
        System.out.println("el carro de la marca: " + marca + " y de color " + super.getColor() + " esta arrancando con " + pasajeros + " pasajeros adentro");
    }

}
