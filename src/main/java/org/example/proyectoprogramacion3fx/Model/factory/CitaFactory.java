package org.example.proyectoprogramacion3fx.Model.factory;


import org.example.proyectoprogramacion3fx.Model.Cita;
import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface CitaFactory {
    public Cita crearCita(LocalDate fecha, Usuario cliente, Vehiculo vehiculo, String hora );
}
