package org.example.proyectoprogramacion3fx.vehiculos;

public class Automovil extends Vehiculo {
    private String tipoAutomovil;

    public Automovil(String tipoAutomovil, String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
}
