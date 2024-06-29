package com.transportes;

public class Moto extends Vehiculo {
    private boolean tieneCanasta;

    public Moto(String marca, int anio, boolean tieneCanasta) {
        super(marca, anio);
        this.tieneCanasta = false;
        this.tieneCanasta = tieneCanasta;
    }

    @Override
    public void arrancar() {
        System.out.println("El motor de la moto ha arrancado.");
    }

    public boolean gettieneCanasta() {
        return tieneCanasta;
    }

    public void settieneCanasta(boolean tieneCanasta) {
        this.tieneCanasta = tieneCanasta;
    }
}
