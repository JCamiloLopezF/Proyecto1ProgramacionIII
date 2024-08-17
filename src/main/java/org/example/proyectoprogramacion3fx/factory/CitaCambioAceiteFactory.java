package org.example.proyectoprogramacion3fx.factory;

import org.example.proyectoprogramacion3fx.Model.Cita;
import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;

import java.time.LocalDateTime;

public class CitaCambioAceiteFactory extends Cita implements CitaFactory {

    public CitaCambioAceiteFactory(LocalDateTime fecha, Usuario cliente, Vehiculo vehiculo) {
        super( fecha,cliente, vehiculo);
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    @Override
    public Cita crearCita() {
        return new Cita(fecha, cliente, vehiculo);
    }
}
