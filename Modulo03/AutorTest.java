package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AutorTest {
    private Autor autor;

    @Before
    public void setUp() {
        autor = new Autor("Jess", "Brasileira");
    }

    @Test
    public void testGetNome() {
        assertEquals("Jess", autor.getNome());
    }

    @Test
    public void testGetNacionalidade() {
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testSetNacionalidade() {
        autor.setNacionalidade("Brasileira");
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testObrasPublicadas() {
        Livro livro1 = new Livro("Java Basico", autor, "Tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "Tecnologia", true);
        Livro[] obras = {livro1, livro2};

        autor.setObrasPublicadas(obras);
        assertArrayEquals(obras, autor.getObrasPublicadas());
    }

    @Test
    public void testToString() {
        assertEquals("Jess", autor.toString());
    }
}
