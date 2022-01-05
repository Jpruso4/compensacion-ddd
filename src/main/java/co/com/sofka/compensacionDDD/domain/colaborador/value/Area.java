package co.com.sofka.compensacionDDD.domain.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Area implements ValueObject<String>{

    private final String value;

    public Area(String value) {
        this.value = Objects.requireNonNull(value, "El area es requerida");
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El area no puede estar vacia");
        }
        if(this.value.length() > 100){
            throw new IllegalArgumentException("El area no debe tener mas de 100 caracteres");
        }
        if(this.value.length() < 5){
            throw new IllegalArgumentException("El area no debe tener menos de 5 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Objects.equals(value, area.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
