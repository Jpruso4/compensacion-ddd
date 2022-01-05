package co.com.sofka.compensacionDDD.domain.colaborador.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCompleto implements ValueObject<NombreCompleto.Properties> {

    private final String nombre;
    private final String apellido;

    public NombreCompleto(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        if(this.nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if(this.nombre.length()<2){
            throw new IllegalArgumentException("El nombre no puede tener menos de dos caracteres");
        }
        if(this.nombre.length()>50){
            throw new IllegalArgumentException("El nombre no puede tener más de cincuenta caracteres");
        }
        if(!this.nombre.matches("^[\\p{L} .'-]+$")){
            throw new IllegalArgumentException("El nombre no puede tener caracteres especiales, ni números");
        }

        this.apellido = Objects.requireNonNull(apellido, "El nombre no puede ser null");
        if(this.apellido.isBlank()){
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        if(this.apellido.length()<2){
            throw new IllegalArgumentException("El apellido no puede tener menos de dos caracteres");
        }
        if(this.apellido.length()>50){
            throw new IllegalArgumentException("El apellido no puede tener más de cincuenta caracteres");
        }
        if(!this.apellido.matches("^[\\p{L} .'-]+$")){
            throw new IllegalArgumentException("El apellido no puede tener caracteres especiales, ni números");
        }
    }

    public Properties value() {
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreCompleto that = (NombreCompleto) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    public interface Properties{
        String nombre();
        String apellido();
    }
}
