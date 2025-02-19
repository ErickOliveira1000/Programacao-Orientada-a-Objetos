package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LivroTest {
    private Livro livro1;
    private Livro livro2;
    private Autor autor;

    @Before
    public void setUp() {
        autor = new Autor("Jess", "Brasileira");
        livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
    }

    @Test
    public void testGetTituloLivro1() {
        assertEquals("Java Basico", livro1.getTitulo());
    }

    @Test
    public void testSetTituloLivro1() {
        livro1.setTitulo("Java Basico");
        assertEquals("Java Basico", livro1.getTitulo());
    }

    @Test
    public void testGetTituloLivro2() {
        assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    public void testSetTituloLivro2() {
        livro2.setTitulo("Java Avançado");
        assertEquals("Java Avançado", livro2.getTitulo());
    }

    @Test
    public void testGetAutor() {
        assertEquals(autor, livro1.getAutor());
        assertEquals(autor, livro2.getAutor());
    }

    @Test
    public void testGetGeneroLivro1() {
        assertEquals("tecnologia", livro1.getGenero());
    }

    @Test
    public void testGetGeneroLivro2() {
        assertEquals("tecnologia", livro2.getGenero());
    }

    @Test
    public void testIsDisponivelLivro1() {
        assertTrue(livro1.isDisponivel());
    }

    @Test
    public void testIsDisponivelLivro2() {
        assertFalse(livro2.isDisponivel());
    }
}
