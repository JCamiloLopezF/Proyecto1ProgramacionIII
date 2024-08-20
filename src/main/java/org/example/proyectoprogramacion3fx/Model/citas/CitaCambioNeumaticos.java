package org.example.proyectoprogramacion3fx.Model.citas;

import org.example.proyectoprogramacion3fx.Model.Cita;
import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CitaCambioNeumaticos extends Cita {

    public CitaCambioNeumaticos(LocalDate fecha, Usuario cliente, Vehiculo vehiculo, String hora) {
        super(fecha, cliente, vehiculo, hora);
    }

}
