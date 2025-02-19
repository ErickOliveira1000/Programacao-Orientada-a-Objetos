package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {
    private Usuario usuario;
    private Emprestimo[] historico;

    @Before
    public void setUp() {
        usuario = new Usuario("Carlos", 25);
        historico = new Emprestimo[2];
    }

    @Test
    public void testGetNome() {
        assertEquals("Carlos", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        assertEquals(25, usuario.getIdade());
    }

    @Test
    public void testSetIdade() {
        usuario.setIdade(30);
        assertEquals(30, usuario.getIdade());
    }

    @Test
    public void testSetAndGetHistoricoEmprestimos() {
        usuario.setHistoricoEmprestimos(historico);
        assertArrayEquals(historico, usuario.getHistoricoEmprestimos());
    }
}

