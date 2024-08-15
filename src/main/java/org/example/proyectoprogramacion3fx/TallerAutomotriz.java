package org.example.proyectoprogramacion3fx;

public class TallerAutomotriz {
    private static TallerAutomotriz instanciaUnica;

    public static TallerAutomotriz getInstanciaUnica() {
        if(instanciaUnica == null){
            instanciaUnica = new TallerAutomotriz();
        }
        return instanciaUnica;
    }
}
