package org.example.proyectoprogramacion3fx.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorCita {

    private List<Cita> citas;

    public GestorCita() {
        this.citas = new ArrayList<>();
    }

    public void crearCita(String placa, String marca, String anio, LocalDate fecha, String hora, String tipoVehiculo, String tipoCita) {
        Cita nuevaCita = new Cita(placa, marca, anio, hora, fecha, tipoVehiculo, tipoCita);
        citas.add(nuevaCita);
        System.out.println("La cita se ha creado con éxito: " + nuevaCita);
    }

    public String cancelarCita(LocalDate fechaHora,  String placa) {

        for (Cita cita : citas) {
            if (cita.getFecha().equals(fechaHora) && cita.getPlaca().equals(placa)) {
                citas.remove(cita);
                String mensaje ="La cita del "+ cita.getFecha() + " del vehículo con placas " + cita.getPlaca() +" ha sido cancelada ";
                return mensaje;
            }
        }
        String mensaje = ("No se encontró cita con la fecha y placa especificada");
        return mensaje;
    }

    public Cita buscarCita(LocalDate fechaHora) {
        for (Cita cita : citas) {
            if (cita.getFecha().equals(fechaHora)) {
                return cita;
            }
        }

        System.out.println("No se encontró cita en la fecha y hora especificada.");
        return null;
    }

    public String listarCitas(String placa) {
        String mensaje = "";
        if (citas.isEmpty()) {
            mensaje = "No hay citas.";
        }
        else {
            mensaje += "La(s) cita(s) del vehiculo con placa "+ placa + " son:\n";
            for (Cita cita : citas) {
                if (cita.getPlaca().equals(placa)){
                    mensaje += cita.getTipoCita() + " es el dia " + cita.getFecha() +" \n";
                }
            }
        }
        return mensaje;
    }
}
