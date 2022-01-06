package co.com.sofka.compensacionDDD.domain.gestionEducacion.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tipo implements ValueObject<String> {

    private final String value;

    public Tipo(String value) {
        this.value = Objects.requireNonNull(value, "El tipo no puede ser null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El tipo no puede estar vacío");
        }
        if(this.value.length()<2){
            throw new IllegalArgumentException("El tipo no puede tener menos de dos caracteres");
        }
        if(this.value.length()>50){
            throw new IllegalArgumentException("El tipo no puede tener más de cincuenta caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tipo tipo = (Tipo) o;
        return Objects.equals(value, tipo.value);
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
