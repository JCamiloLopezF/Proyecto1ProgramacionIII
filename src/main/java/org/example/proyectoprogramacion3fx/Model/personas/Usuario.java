package org.example.proyectoprogramacion3fx.Model.personas;

public class Usuario extends Persona{
    private String telefono;
    private String correo;

    public Usuario(String telefono, String correo, String nombre, String identificacion) {
        super(nombre, identificacion);
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
}
