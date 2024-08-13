package org.example.proyectoprogramacion3fx.vehiculos;

public class Camioneta extends Vehiculo {
    private String tipoTraccion;

    public Camioneta(String tipoTraccion, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.tipoTraccion = tipoTraccion;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }
}

