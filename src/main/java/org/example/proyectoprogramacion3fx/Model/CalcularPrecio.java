package org.example.proyectoprogramacion3fx.Model;

import org.example.proyectoprogramacion3fx.Model.citas.TipoCita;
import org.example.proyectoprogramacion3fx.Model.vehiculos.TipoVehiculo;

public class CalcularPrecio {

    public double calcularPrecio(TipoCita tipoCita, TipoVehiculo tipoVehiculo) {

        /*

        --- switch mejorado ---

        double precioBase = switch (tipoVehiculo) {
            case AUTOMOVIL -> 200000.0;
            case CAMPERO -> 300000.0;
            case CAMIONETA -> 400000.0;
            case MOTO -> 100000.0;
            default -> throw new IllegalArgumentException("Tipo de vehiculo no valido");
        };*/


        double precioBase = 0.0;

        switch (tipoVehiculo) {
            case AUTOMOVIL:
                precioBase = 200000.0;
                break;

            case CAMPERO:
                precioBase = 300000.0;
                break;

            case CAMIONETA:
                precioBase = 400000.0;
                break;

            case MOTO:
                precioBase = 100000.0;
                break;

            default:
                throw new IllegalArgumentException("Tipo de vehiculo no valido");

        }


        return aplicarAjustePorCita(precioBase, tipoCita);

        //double precioFinal = aplicarAjustePorCita(precioBase, tipoCita);

        //return precioFinal;

    }

    private double aplicarAjustePorCita(double precioBase, TipoCita tipoCita) {

        double multiplicador = 1.0;

        switch (tipoCita) {
            case CAMBIO_ACEITE:
                multiplicador = 0.5;
                break;

            case REVISION_GENERAL:
                multiplicador = 1.6;
                break;

            case CAMBIO_NEUMATICOS:
                break;

            default:
                throw new IllegalArgumentException("Tipo de cita no valido");
        }

        return precioBase * multiplicador;
    }
}
