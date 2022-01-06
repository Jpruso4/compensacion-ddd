package co.com.sofka.compensacionDDD.domain.experiencia.value;

import co.com.sofka.domain.generic.Identity;

public class ExperienciaId extends Identity {

    private ExperienciaId(String value){
        super(value);
    }

    public ExperienciaId(){
        super();
    }

    public static ExperienciaId of(String value){
        return new ExperienciaId(value);
    }
}
