package co.com.sofka.compensacionDDD.domain.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cedula implements ValueObject<String> {
    private final String valor;

    public Cedula(String valor) {
        this.valor = Objects.requireNonNull(valor, "La cedula es requerida");
        if(this.valor.isBlank()){
            throw new IllegalArgumentException("La cedula no puede estar vacía");
        }
        if(this.valor.length() < 8){
            throw new IllegalArgumentException("La cedula no puede contener tener menos de ocho caracteres");
        }
        if(this.valor.length() > 10){
            throw new IllegalArgumentException("La cedula no puede contener tener mas de diez caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cedula cedula = (Cedula) o;
        return Objects.equals(valor, cedula.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    public String value() {
        return valor;
    }


}
