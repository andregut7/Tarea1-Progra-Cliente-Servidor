package com.mycompany.main;

public class Main {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo(4, 5, "rojo");
        v1.informacion();

        Terrestre t1 = new Terrestre(4, 2, "azul", "cuadraciclo");
        t1.setColor("verde");
        System.out.println(t1.getColor());
        t1.info();

        Moto m1 = new Moto(2, 2, "negra", "moto sport", "yamaha");
        m1.setMarca("honda");
        System.out.println(m1.getMarca());
        System.out.println(m1.getTipoVehiculo());
        m1.info();

        Carro c1 = new Carro(4, 5, "blanco", "carro deportivo", 3000, 3, "ferrari");
        c1.setCilindraje(3500);
        System.out.println("el cilindraje de la marca " + c1.getMarca() + " es de: " + c1.getCilindraje());
        c1.arrancar();

        Acuatico a1 = new Acuatico("lancha", "200km/s", 20);
        System.out.println(a1.getCapacidad());
        a1.setCapacidad(30);
        System.out.println(a1.getCapacidad());
        a1.navegar();

        Barco b1 = new Barco(a1);
        b1.getDatos().setTipo("barco de carga");
        System.out.println(b1.getDatos().getTipo());
        b1.izarVelas();

        Aereo a = new Aereo("jet", "3000km/s");
        a.info();

    }
}
