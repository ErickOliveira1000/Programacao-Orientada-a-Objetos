package com.mycompany.app;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Estrategia.EstrategiaPublicacaoLivro;
import com.mycompany.app.Estrategia.EstrategiaPublicacaoArtigo;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PublicacaoTest {
    @Test
    public void testPublicacaoLivro() {
        Autor autor = new Autor("José Saramago", "Português");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        autor.publicar();

        assertEquals("Publicando um livro..." + System.lineSeparator(), outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testPublicacaoArtigo() {
        Autor autor = new Autor("Fernando Pessoa", "Português");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        autor.publicar();

        assertEquals("Publicando um artigo..." + System.lineSeparator(), outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testSemEstrategiaPublicacao() {
        Autor autor = new Autor("Carlos Drummond", "Brasileiro");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        autor.publicar();

        assertEquals("Nenhuma estratégia de publicação definida." + System.lineSeparator(), outContent.toString());
        System.setOut(System.out);
    }
}
