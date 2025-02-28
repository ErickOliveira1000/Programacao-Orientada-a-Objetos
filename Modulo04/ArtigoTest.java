package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Artigo;


public class ArtigoTest {
    @Test
    public void testeAutor() {
        Autor autor = new Autor("Clarice Lispector", "Brasileira", false);
        
        assertEquals("Clarice Lispector", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
        assertFalse(autor.getUsuario());
    }

    @Test
    public void testArtigoPublicado() {
        Autor autor = new Autor("Clarice Lispector", "Brasileira", false);

        Artigo artigoPublicado = new Artigo("A Hora da Estrela", autor, "Ficção", true);

        assertEquals("A Hora da Estrela", artigoPublicado.getTitulo());
        assertEquals(autor, artigoPublicado.getAutor());
        assertEquals("Ficção", artigoPublicado.getGenero());
        assertTrue(artigoPublicado.getPublicado());
    }

    @Test
    public void testArtigoNaoPublicado() {
        Autor autor = new Autor("Clarice Lispector", "Brasileira", false);

        Artigo artigoNaoPublicado = new Artigo("A Paixão Segundo G.H.", autor, "Ficção", false);

        assertEquals("A Paixão Segundo G.H.", artigoNaoPublicado.getTitulo());
        assertEquals(autor, artigoNaoPublicado.getAutor());
        assertEquals("Ficção", artigoNaoPublicado.getGenero());
        assertFalse(artigoNaoPublicado.getPublicado());
    }

}