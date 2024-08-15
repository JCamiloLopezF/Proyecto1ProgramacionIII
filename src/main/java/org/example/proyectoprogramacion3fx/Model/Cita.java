package org.example.proyectoprogramacion3fx.Model;

import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;

import java.time.LocalDate;

public abstract class Cita {
    private LocalDate fecha;
    private Usuario cliente;
    private Vehiculo vehiculo;

    public Cita(LocalDate fecha, Usuario cliente, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }
}
