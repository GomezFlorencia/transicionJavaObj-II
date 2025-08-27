package ar.edu;

public abstract class Persona {
    private Integer edad;

    public Persona(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPotencia() {
        return 20;
    };

    public Integer getInteligencia() {
        return (edad >= 20 && edad <= 40) ? 12 : 8;

    }

    public Boolean esDestacada() {
        return (edad == 25 || edad == 35);
    }

}
