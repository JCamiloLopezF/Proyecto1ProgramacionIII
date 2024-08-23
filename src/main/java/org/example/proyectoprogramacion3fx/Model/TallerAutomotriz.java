package org.example.proyectoprogramacion3fx.Model;

import org.example.proyectoprogramacion3fx.Model.personas.Usuario;

import java.util.ArrayList;

public class TallerAutomotriz {
    private static TallerAutomotriz instanciaUnica;
    public ArrayList<Usuario> listaUsuarios;

    public TallerAutomotriz() {
        listaUsuarios = new ArrayList<Usuario>();
    }

    public static TallerAutomotriz getInstanciaUnica() {
        if(instanciaUnica == null){
            instanciaUnica = new TallerAutomotriz();
        }
        return instanciaUnica;
    }
}
