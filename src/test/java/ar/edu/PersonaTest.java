package ar.edu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Atleta;
import ar.edu.unahur.obj2.Docente;
import ar.edu.unahur.obj2.Generica;
import planeta.Planeta;

public class PersonaTest {
    @Test
    void testJulieta() {
        Persona julieta = new Generica(42);
        assertEquals(20, julieta.getPotencia());
        assertEquals(8, julieta.getInteligencia());
        assertFalse(julieta.esDestacada());

    }

    @Test
    void testAna() {
        Persona ana = new Atleta(25);
        assertEquals(28, ana.getPotencia());
        assertEquals(12, ana.getInteligencia());
        assertTrue(ana.esDestacada());

    }

    @Test
    void testRosa() {
        Atleta rosa = new Atleta(45);
        rosa.aprenderUnaTecnica(6);
        assertEquals(52, rosa.getPotencia());
        assertEquals(8, rosa.getInteligencia());
        assertTrue(rosa.esDestacada());

    }

    @Test
    void testPerla() {
        Atleta perla = new Atleta(28);
        perla.aprenderUnaTecnica(2);
        perla.entrenar(10);
        assertEquals(44, perla.getPotencia());
        assertEquals(12, perla.getInteligencia());
        assertFalse(perla.esDestacada());
    }

    @Test
    void testLuisa() {
        Docente luisa = new Docente(35);
        luisa.darCurso(1);
        assertEquals(20, luisa.getPotencia());
        assertEquals(14, luisa.getInteligencia());
        assertFalse(luisa.esDestacada());

    }

    @Test
    void testMonica() {
        Docente monica = new Docente(45);
        monica.darCurso(6);
        assertEquals(20, monica.getPotencia());
        assertEquals(20, monica.getInteligencia());
        assertTrue(monica.esDestacada());

    }

}
