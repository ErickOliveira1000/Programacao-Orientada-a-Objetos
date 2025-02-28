package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Model.Autor;

import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testAutorCreation() {
        Autor autor = new Autor("João Silva", "Brasileira", true);

        assertEquals("João Silva", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
        assertTrue(autor.getUsuario());
    }

    @Test
    public void testSetters() {
        Autor autor = new Autor("João Silva", "Brasileira", true);

        autor.setNacionalidade("Portuguesa");
        autor.setUsuario(false);

        assertEquals("Portuguesa", autor.getNacionalidade());
        assertFalse(autor.getUsuario());
    }

    @Test
    public void testToString() {
        Autor autorUsuario = new Autor("Ana Pereira", "Portuguesa", true);
        Autor autorTradicional = new Autor("Carlos Souza", "Brasileira", false);

        assertEquals("Ana Pereira", autorUsuario.toString());
        assertEquals("Carlos Souza", autorTradicional.toString());
    }
} 

