package planeta;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import ar.edu.Persona;

public class Planeta {
    private Set<Persona> habitantes = new HashSet<>(); // conjunto vacio de personas
    private Integer cantidadMuseos;

    public Planeta(Set<Persona> habitantes, Integer cantidadMuseos) {
        this.habitantes = habitantes;
        this.cantidadMuseos = cantidadMuseos;
    }

    public Set<Persona> getHabitantes() {
        return habitantes;
    }

    public Integer getCantidadMuseos() {
        return cantidadMuseos;
    }

    public void setCantidadDeMuseos(Integer cantidadMuseos) {
        this.cantidadMuseos = cantidadMuseos;
    }

    public void agregarPersona(Persona habitante) {
        habitantes.add(habitante);

    }

    public Set<Persona> delegacionDiplomatica() {
        return habitantes.stream().filter(p -> p.esDestacada()).collect(Collectors.toSet());

    }

    public int getValorInicialDeLaDefensa() {
        return (int) habitantes.stream().filter(p -> p.getPotencia() >= 30).count();
    }

    public Boolean haySuficientesMuseos() {
        return cantidadMuseos >= 2;
    }

    public Boolean todosLosHabitantesTienenInteligenciaMinima() {
        return habitantes.stream().allMatch(p -> p.getInteligencia() >= 10);

    }

    public Boolean esCulto() {
        return haySuficientesMuseos() && todosLosHabitantesTienenInteligenciaMinima();
    }

    public Integer getPotenciaReal() {
        return habitantes.stream().mapToInt(p -> p.getPotencia()).sum();
    }

}
