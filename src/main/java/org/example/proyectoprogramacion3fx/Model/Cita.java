package org.example.proyectoprogramacion3fx.Model;

import java.time.LocalDate;

public class Cita {
    private String placa;
    private String marca;
    private String anio;
    private String hora;
    private LocalDate fecha;
    private String tipoVehiculo;
    private String tipoCita;


    public Cita(String placa, String marca, String anio, String hora, LocalDate fecha, String tipoVehiculo,
            String tipoCita) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.hora = hora;
        this.fecha = fecha;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoCita = tipoCita;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getAnio() {
        return anio;
    }


    public void setAnio(String anio) {
        this.anio = anio;
    }


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }


    public LocalDate getFecha() {
        return fecha;
    }


    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    public String getTipoVehiculo() {
        return tipoVehiculo;
    }


    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }


    public String getTipoCita() {
        return tipoCita;
    }


    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }
}
