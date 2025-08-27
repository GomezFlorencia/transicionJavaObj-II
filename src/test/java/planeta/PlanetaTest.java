package planeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.Persona;
import ar.edu.unahur.obj2.Atleta;
import ar.edu.unahur.obj2.Docente;
import ar.edu.unahur.obj2.Generica;

public class PlanetaTest {
    Planeta triton;
    Persona julieta;
    Persona ana;
    Atleta rosa;
    Atleta perla;
    Docente monica;
    Docente luisa;

    @BeforeEach
    void setUp() {
        julieta = new Generica(42);
        ana = new Atleta(25);
        rosa = new Atleta(45);
        rosa.aprenderUnaTecnica(6);
        perla = new Atleta(28);
        perla.aprenderUnaTecnica(2);
        perla.entrenar(10);
        monica = new Docente(45);
        monica.darCurso(6);
        luisa = new Docente(35);
        luisa.darCurso(1);

        triton = new Planeta(new HashSet<>(), 1);
        triton.agregarPersona(ana);
        triton.agregarPersona(rosa);
        triton.agregarPersona(monica);
        triton.agregarPersona(julieta);
        triton.agregarPersona(perla);
        triton.agregarPersona(luisa);

    }

    @Test
    void tieneDelegacionDiplomatica() {
        assertTrue(triton.delegacionDiplomatica().contains(monica));
        assertTrue(triton.delegacionDiplomatica().contains(rosa));
        assertTrue(triton.delegacionDiplomatica().contains(ana));

    }

    @Test
    void testEsCulto() {
        assertFalse(triton.esCulto());

    }

    @Test
    void testGetPotenciaReal() {

        assertEquals(184, triton.getPotenciaReal());
    }

    @Test
    void testGetValorInicialDeLaDefensa() {
        assertEquals(2, triton.getValorInicialDeLaDefensa());

    }
}
