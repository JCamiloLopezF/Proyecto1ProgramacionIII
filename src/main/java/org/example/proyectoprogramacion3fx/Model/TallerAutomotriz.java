package org.example.proyectoprogramacion3fx.Model;

public class TallerAutomotriz {
    private static TallerAutomotriz instanciaUnica;
    public GestorCita gestorCita;

    public TallerAutomotriz() {
        gestorCita = new GestorCita();
    }

    public static TallerAutomotriz getInstanciaUnica() {
        if(instanciaUnica == null){
            instanciaUnica = new TallerAutomotriz();
        }
        return instanciaUnica;
    }
}
