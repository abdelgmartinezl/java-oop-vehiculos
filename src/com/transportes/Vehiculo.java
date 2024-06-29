package com.transportes;

public class Vehiculo {
    private String marca;
    private int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public void arrancar() {
        System.out.println("Arranca el motor del vehiculo.");
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
