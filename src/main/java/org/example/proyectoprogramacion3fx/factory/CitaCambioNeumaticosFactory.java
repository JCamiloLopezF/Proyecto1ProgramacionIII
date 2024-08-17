package org.example.proyectoprogramacion3fx.factory;

import org.example.proyectoprogramacion3fx.Model.Cita;
import org.example.proyectoprogramacion3fx.Model.citas.CitaCambioNeumaticos;

public class CitaCambioNeumaticosFactory implements CitaFactory{


    @Override
    public Cita crearCita() {
        CitaCambioNeumaticos cita = new CitaCambioNeumaticos(null, null, null);
        cita.setFechaHora(fecha);
        cita.setCliente(cliente);
        cita.setVehiculo(vehiculo);
        return cita;
    }
}