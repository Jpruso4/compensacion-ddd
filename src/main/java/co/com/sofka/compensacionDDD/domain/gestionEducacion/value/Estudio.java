package co.com.sofka.compensacionDDD.domain.gestionEducacion.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estudio implements ValueObject<String> {

    private final String value;

    public Estudio(String value) {
        this.value = Objects.requireNonNull(value, "El estudio no puede ser null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El estudio no puede estar vacío");
        }
        if(this.value.length()<2){
            throw new IllegalArgumentException("El estudio no puede tener menos de dos caracteres");
        }
        if(this.value.length()>50){
            throw new IllegalArgumentException("El estudio no puede tener más de cincuenta caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudio estudio = (Estudio) o;
        return Objects.equals(value, estudio.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
