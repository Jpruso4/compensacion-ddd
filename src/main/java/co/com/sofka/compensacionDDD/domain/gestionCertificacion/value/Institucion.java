package co.com.sofka.compensacionDDD.domain.gestionCertificacion.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Institucion implements ValueObject<String> {

    private final String value;

    public Institucion(String value) {
        this.value = Objects.requireNonNull(value, "La institucion no puede ser null");
        if(this.value.isBlank()) throw new IllegalArgumentException("La institucion no puede estar vacio");
        if(this.value.length()<2){
            throw new IllegalArgumentException("La institucion no puede tener menos de dos caracteres");
        }
        if(this.value.length()>100){
            throw new IllegalArgumentException("La institucion no puede tener más de cien caracteres");
        }
        if(!this.value.matches("^[\\p{L} .'-]+$")){
            throw new IllegalArgumentException("La institucion no puede tener caracteres especiales, ni números");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institucion that = (Institucion) o;
        return Objects.equals(value, that.value);
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
