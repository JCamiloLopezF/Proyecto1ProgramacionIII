package org.example.proyectoprogramacion3fx.Model;

import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;

import java.time.LocalDateTime;

public class Cita {
    private LocalDateTime fechaHora;
    private Usuario cliente;
    private Vehiculo vehiculo;

    public Cita(LocalDateTime fechaHora, Usuario cliente, Vehiculo vehiculo) {
        this.fechaHora = fechaHora;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
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

    @Override
    public String toString() {
        return "Cita{" +
                "cliente='" + cliente + '\'' +
                ", vehiculo='" + vehiculo + '\'' +
                ", fechaHora=" + fechaHora +
                '}';
    }
}
