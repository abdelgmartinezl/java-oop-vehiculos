package com.transportes;

public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, int anio, int numeroPuertas) {
        super(marca, anio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void arrancar() {
        System.out.println("El motor del carro ha arrancado.");
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
