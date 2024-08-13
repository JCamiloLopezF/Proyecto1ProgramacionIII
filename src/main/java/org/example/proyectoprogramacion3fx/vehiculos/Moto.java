package org.example.proyectoprogramacion3fx.vehiculos;

public class Moto extends Vehiculo {
    private String cilindraje;

    public Moto(String cilindraje, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
}
