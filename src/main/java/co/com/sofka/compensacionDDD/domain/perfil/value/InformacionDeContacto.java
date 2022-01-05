package co.com.sofka.compensacionDDD.domain.perfil.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformacionDeContacto implements ValueObject<InformacionDeContacto.Properties> {

    private final String correo;
    private final String telefono;

    public InformacionDeContacto(String correo, String telefono) {
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String correo() {
                return correo;
            }

            @Override
            public String telefono() {
                return telefono;
            }
        };
    }

    public interface Properties{
        String correo();
        String telefono();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InformacionDeContacto that = (InformacionDeContacto) o;
        return Objects.equals(correo, that.correo) && Objects.equals(telefono, that.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo, telefono);
    }
}
