package org.example.proyectoprogramacion3fx.factory;

public class CitaCambioAceiteFactory implements CitaFactory {

    @Override
    public void crearCita() {
        CitaCambioAceite cita = new CitaCambioAceite();
        cita.setFecha(fecha);
        cita.vehiculo(vehiculo.TipoVehiculo);
    }
}
