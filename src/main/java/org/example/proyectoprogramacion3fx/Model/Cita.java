package org.example.proyectoprogramacion3fx.Model;

import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cita {
    private LocalDate fecha;
    private Usuario cliente;
    private Vehiculo vehiculo;
    private String hora;

    public Cita(LocalDate fecha, Usuario cliente, Vehiculo vehiculo, String hora) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.hora = hora;
    }

    public LocalDate getFechaHora() {
        return fecha;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fecha = fecha;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getHora(){
        return hora;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "cliente='" + cliente + '\'' +
                ", vehiculo='" + vehiculo + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
