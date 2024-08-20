package org.example.proyectoprogramacion3fx.Model.personas;

import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;

public class Usuario extends Persona{
    private String telefono;
    private String correo;
    private Vehiculo vehiculo;

    public Usuario(String telefono, String correo, String nombre, String identificacion, Vehiculo vehiculo) {
        super(nombre, identificacion);
        this.vehiculo = vehiculo;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Vehiculo getVehiculo() { return vehiculo; }
}
