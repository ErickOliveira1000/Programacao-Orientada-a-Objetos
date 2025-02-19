package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class EmprestimoTest {
    
    @Test
    public void testEmprestimo() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }
    
    @Test
    public void testSetDataDevolucao() {
        Date dataRetirada = new Date();
        Date dataDevolucaoInicial = new Date();
        Date novaDataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucaoInicial, livro, usuario);
        emprestimo.setDataDevolucao(novaDataDevolucao);
        
        assertEquals(novaDataDevolucao, emprestimo.getDataDevolucao());
    }
}