package ar.edu.unahur.obj2;

import ar.edu.Persona;

public class Docente extends Persona {
    private Integer cantidadDeCursos;

    public Docente(Integer edad) {
        super(edad);
        this.cantidadDeCursos = 0;
    }

    public Integer getCantidadDeCursos() {
        return cantidadDeCursos;
    }

    @Override
    public Integer getInteligencia() {

        return super.getInteligencia() + cantidadDeCursos * 2;
    }

    @Override
    public Boolean esDestacada() {

        return cantidadDeCursos > 3;
    }

    public void darCurso(int cantidad) {
        cantidadDeCursos += cantidad;
    }

}
