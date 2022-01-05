package co.com.sofka.compensacionDDD.domain.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class FechaDeNacimiento implements ValueObject<LocalDate> {

    private final LocalDate value;

    public FechaDeNacimiento(LocalDate value) {
        this.value = Objects.requireNonNull(value, "La fecha no puede ser null");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaDeNacimiento that = (FechaDeNacimiento) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public LocalDate value() {
        return value;
    }
}
