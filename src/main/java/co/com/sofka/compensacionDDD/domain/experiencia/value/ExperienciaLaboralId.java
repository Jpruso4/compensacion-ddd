package co.com.sofka.compensacionDDD.domain.experiencia.value;

import co.com.sofka.domain.generic.Identity;

public class ExperienciaLaboralId extends Identity {

    private ExperienciaLaboralId(String value){
        super(value);
    }

    public ExperienciaLaboralId(){
        super();
    }

    public static ExperienciaLaboralId of(String value){
        return new ExperienciaLaboralId(value);
    }
}
