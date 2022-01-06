package co.com.sofka.compensacionDDD.domain.experiencia.value;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ConocimientosAdquiridos implements ValueObject<String> {

    private final String value;

    public ConocimientosAdquiridos(String value){
        this.value = Objects.requireNonNull(value, "los conocimientos no pueden ser null");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConocimientosAdquiridos that = (ConocimientosAdquiridos) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value(){
        return value;
    }
}
