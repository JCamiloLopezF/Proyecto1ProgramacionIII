package org.example.proyectoprogramacion3fx.Model.citas;

import org.example.proyectoprogramacion3fx.Model.Cita;
import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;
import java.time.LocalDateTime;

public class CitaCambioNeumaticos extends Cita {

    public CitaCambioNeumaticos(LocalDateTime fecha, Usuario cliente, Vehiculo vehiculo) {
        super(fecha, cliente, vehiculo);
    }

}
