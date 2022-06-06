package com.mycompany.main;

public class Moto extends Terrestre {

    private String marca;

    public Moto(int cantLlantas, int asientos, String color, String tipoVehiculo, String marca) {
        super(cantLlantas, asientos, color, tipoVehiculo);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void frenar() {
        System.out.println("la moto de color " + super.getColor() + "esta frenando");
    }

    @Override
    public void info() {

        System.out.println(" Tipo de Vehiculo: " + super.getTipoVehiculo() + " de color " + super.getColor() + " tiene " + super.getAsientos() + " asientos, " + super.getCantLlantas() + " llantas");
    }

}
