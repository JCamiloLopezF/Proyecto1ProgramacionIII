package org.example.proyectoprogramacion3fx;

import org.example.proyectoprogramacion3fx.Model.Cita;
import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorCita {

    private List<Cita> citas;

    public GestorCita() {
        this.citas = new ArrayList<>();
    }

    public void crearCita(LocalDate fechaHora, Usuario cliente, Vehiculo vehiculo, String hora) {
        Cita nuevaCita = new Cita(fechaHora, cliente, vehiculo, hora);
        citas.add(nuevaCita);
        System.out.println("La cita se ha creado con éxito: " + nuevaCita);
    }

    public boolean cancelarCita(LocalDate fechaHora) {
        for (Cita cita : citas) {
            if (cita.getFechaHora().equals(fechaHora)) {
                citas.remove(cita);
                System.out.println("La cita ha sido cancelada: " + cita);
                return true;
            }
        }

        System.out.println("No se encontró cita en la fecha y hora especificada.");
        return false;
    }

    public Cita buscarCita(LocalDate fechaHora) {
        for (Cita cita : citas) {
            if (cita.getFechaHora().equals(fechaHora)) {
                return cita;
            }
        }

        System.out.println("No se encontró cita en la fecha y hora especificada.");
        return null;
    }

    public void listarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas.");
        } else {
            for (Cita cita : citas) {
                System.out.println(cita);
            }
        }
    }
}
