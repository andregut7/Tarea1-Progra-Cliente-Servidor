package com.mycompany.main;

public class Terrestre extends Vehiculo {

    private String tipoVehiculo;

    public Terrestre(int cantLlantas, int asientos, String color, String tipoVehiculo) {
        super(cantLlantas, asientos, color);

        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void info() {
        System.out.println("Tipo de Vehiculo: " + tipoVehiculo + " de color " + super.getColor() + " tiene " + super.getAsientos() + " asientos y " + super.getCantLlantas() + " llantas");
    }
}
