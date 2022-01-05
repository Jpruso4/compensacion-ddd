package co.com.sofka.compensacionDDD.domain.colaborador.command;

import co.com.sofka.compensacionDDD.domain.colaborador.value.*;
import co.com.sofka.compensacionDDD.domain.generics.HojaDeVidaId;
import co.com.sofka.compensacionDDD.domain.generics.NombreCompleto;
import co.com.sofka.compensacionDDD.domain.perfil.value.PerfilId;
import co.com.sofka.domain.generic.Command;

public class CrearColaborador extends Command {

    private final ColaboradorId colaboradorId;
    private final HojaDeVidaId hojaDeVidaId;
    private final FechaDeNacimiento fechaDeNacimiento;
    private final NombreCompleto nombreCompleto;
    private final Cedula cedula;
    private final Genero genero;
    private final Area area;
    private final PerfilId perfilId;

    public CrearColaborador(ColaboradorId colaboradorId, HojaDeVidaId hojaDeVidaId, FechaDeNacimiento fechaDeNacimiento, NombreCompleto nombreCompleto, Cedula cedula, Genero genero, Area area, PerfilId perfilId) {
        this.colaboradorId = colaboradorId;
        this.hojaDeVidaId = hojaDeVidaId;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.genero = genero;
        this.area = area;
        this.perfilId = perfilId;
    }

    public ColaboradorId getColaboradorId() {
        return colaboradorId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }

    public FechaDeNacimiento getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public Genero getGenero() {
        return genero;
    }

    public Area getArea() {
        return area;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }
}
