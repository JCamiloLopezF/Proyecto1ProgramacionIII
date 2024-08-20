package org.example.proyectoprogramacion3fx;

import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.MarcaVehiculoCarro;
import org.example.proyectoprogramacion3fx.Model.vehiculos.TipoVehiculo;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //Creación de taller automotriz único
        TallerAutomotriz tallerAutomotriz = TallerAutomotriz.getInstanciaUnica();

        List<Usuario> usuarios = new ArrayList<>();

        //Creacion de automoviles
        Vehiculo automovil1 = new Vehiculo("JQK779", MarcaVehiculoCarro.BUGATTI, 2023, TipoVehiculo.AUTOMOVIL);
        Vehiculo automovil2 = new Vehiculo("GJX152", MarcaVehiculoCarro.CORVETTE, 2025, TipoVehiculo.AUTOMOVIL);
        Vehiculo automovil3 = new Vehiculo("HKL324", MarcaVehiculoCarro.RENAULT, 2019, TipoVehiculo.AUTOMOVIL);
        Vehiculo automovil4 = new Vehiculo("LUS267", MarcaVehiculoCarro.LEXUS, 2020, TipoVehiculo.CAMIONETA);

        //Creación de usuarios
        Usuario usuario1 = new Usuario("311233522", "asdasdasdad@gmail.com", "Daniel", "1089257634", automovil1);
        Usuario usuario2 = new Usuario("311851545", "hasgsfgasad@gmail.com", "Abraham", "1056234563", automovil4);

        //Creación de lista de usuarios
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        

    }

}
