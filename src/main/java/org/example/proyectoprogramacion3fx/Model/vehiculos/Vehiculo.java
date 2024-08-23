package org.example.proyectoprogramacion3fx.Model.vehiculos;

public abstract class Vehiculo {
    private String placa;
    private int anioVehiculo;
    private final TipoVehiculo tipoVehiculo;

    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.anioVehiculo = anioVehiculo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnioVehiculo() {
        return anioVehiculo;
    }

    public void setAnioVehiculo(int anioVehiculo) {
        this.anioVehiculo = anioVehiculo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
}
