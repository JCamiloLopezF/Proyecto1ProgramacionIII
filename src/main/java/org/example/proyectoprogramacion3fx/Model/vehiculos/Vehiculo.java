package org.example.proyectoprogramacion3fx.Model.vehiculos;

public class Vehiculo {
    private String placa;
    private MarcaVehiculoCarro marcaCarro;
    private MarcaVehiculoMoto marcaMoto;
    private int anioVehiculo;
    private final TipoVehiculo tipoVehiculo;

    public Vehiculo(String placa, MarcaVehiculoCarro marcaCarro, MarcaVehiculoMoto marcaMoto, int anioVehiculo, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.marcaCarro = marcaCarro;
        this.marcaMoto = marcaMoto;
        this.anioVehiculo = anioVehiculo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public MarcaVehiculoCarro getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(MarcaVehiculoCarro marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public MarcaVehiculoMoto getMarcaMoto() {
        return marcaMoto;
    }

    public void setMarcaMoto(MarcaVehiculoMoto marcaMoto) {
        this.marcaMoto = marcaMoto;
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
