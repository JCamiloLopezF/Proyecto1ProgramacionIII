package org.example.proyectoprogramacion3fx.factory;

import org.example.proyectoprogramacion3fx.Model.Cita;
import org.example.proyectoprogramacion3fx.Model.citas.CitaCambioNeumaticos;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;
import org.example.proyectoprogramacion3fx.Model.personas.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CitaCambioNeumaticosFactory implements CitaFactory{

    @Override
    public Cita crearCita(LocalDate fecha, Usuario cliente, Vehiculo vehiculo, String hora) {
        return new Cita(fecha, cliente, vehiculo, hora);
    }
}