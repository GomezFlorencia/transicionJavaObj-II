package ar.edu.unahur.obj2;

import ar.edu.Persona;

public class Atleta extends Persona {

    private Integer masaMuscular;
    private Integer cantidadTecnicas;

    public Atleta(Integer edad) {// Los inicializo en 2 y 4 por eso no ponfo el parametro.
        super(edad);
        this.masaMuscular = 4;
        this.cantidadTecnicas = 2;
    }

    public Integer getMasaMuscular() {
        return masaMuscular;
    }

    public Integer getCantidadTecnicas() {
        return cantidadTecnicas;
    }

    @Override
    public Integer getPotencia() {

        return super.getPotencia() + masaMuscular * cantidadTecnicas;
    }

    @Override
    public Boolean esDestacada() {

        return (super.esDestacada() || cantidadTecnicas > 5); // cumple copn la condicion en comun de todas las personas
                                                              // o conoce mas de 5 tecnicas.
    }

    public void entrenar(Integer dias) {
        this.masaMuscular += dias / 5;

    }

    public void aprenderUnaTecnica(int cantidad) {
        this.cantidadTecnicas += cantidad;

    }

}
