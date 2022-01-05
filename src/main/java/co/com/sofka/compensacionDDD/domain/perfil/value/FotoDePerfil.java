package co.com.sofka.compensacionDDD.domain.perfil.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FotoDePerfil implements ValueObject<String> {

    private final String value;

    public FotoDePerfil(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FotoDePerfil that = (FotoDePerfil) o;
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
