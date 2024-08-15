package org.example.proyectoprogramacion3fx.factory;

public class CitaCambioNeumaticosFactory implements CitaFactory{

    @Override
    public void crearCita() {
        CitaCambioNeumaticos cita = new CitaCambioNeumaticos();
        cita.setFecha(fecha);
        cita.setVehiculo(vehiculo.TipoVehiculo);
    }
}
