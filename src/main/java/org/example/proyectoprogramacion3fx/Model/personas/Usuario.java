package org.example.proyectoprogramacion3fx.Model.personas;

import org.example.proyectoprogramacion3fx.Model.vehiculos.Automovil;

public class Usuario extends Persona{
    private String telefono;
    private String correo;
    private Automovil automovil;

    public Usuario(String telefono, String correo, String nombre, String identificacion, Automovil automovil) {
        super(nombre, identificacion);
        this.automovil = automovil;
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

    public Automovil getAutomovil() { return automovil; }
}
