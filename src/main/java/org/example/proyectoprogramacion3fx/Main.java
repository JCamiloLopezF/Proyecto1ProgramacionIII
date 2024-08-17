package org.example.proyectoprogramacion3fx;

import org.example.proyectoprogramacion3fx.Model.personas.Usuario;
import org.example.proyectoprogramacion3fx.Model.vehiculos.Automovil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //Creación de taller automotriz único
        TallerAutomotriz tallerAutomotriz = TallerAutomotriz.getInstanciaUnica();

        List<Usuario> usuarios = new ArrayList<>();

        //Creacion de automoviles
        Automovil automovil1 = new Automovil("Carro", "SZG851", "BMW", "2019");
        Automovil automovil2 = new Automovil("Carro", "WHZ445", "Audi", "2023");
        Automovil automovil3 = new Automovil("Moto", "LSF08Q", "Yamaha", "2018");
        Automovil automovil4 = new Automovil("Camioneta", "JQK881", "Lexus", "2025");

        //Creación de usuarios
        Usuario usuario1 = new Usuario("311233522", "asdasdasdad@gmail.com", "Daniel", "1089257634", automovil1);
        Usuario usuario2 = new Usuario("311851545", "hasgsfgasad@gmail.com", "Abraham", "1056234563", automovil4);

        //Creación de lista de usuarios
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        

    }

}
