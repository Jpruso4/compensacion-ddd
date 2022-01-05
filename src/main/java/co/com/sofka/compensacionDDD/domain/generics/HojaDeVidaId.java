package co.com.sofka.compensacionDDD.domain.generics;

import co.com.sofka.domain.generic.Identity;

public class HojaDeVidaId extends Identity {

    public HojaDeVidaId(){

    }

    public HojaDeVidaId(String id){
        super(id);
    }

    public static HojaDeVidaId of(String id){
        return new HojaDeVidaId(id);
    }
}
