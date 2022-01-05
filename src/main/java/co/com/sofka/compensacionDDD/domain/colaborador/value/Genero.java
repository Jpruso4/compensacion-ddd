package co.com.sofka.compensacionDDD.domain.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Genero implements ValueObject<String> {

    private final String value;

    public Genero(String value) {
        this.value = Objects.requireNonNull(value, "El genero no puede ser null");
        if(this.value.isBlank()) throw new IllegalArgumentException("El genero no puede estar vacio");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genero genero = (Genero) o;
        return Objects.equals(value, genero.value);
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
