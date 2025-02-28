package com.mycompany.app;

import java.util.Date;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class Main {
    public static void main(String[] args) {

        // Criando um  Autor
        Autor autor = new Autor("Jess","Inglesa", true);

        // Criando um Livro
        Livro livro = new Livro("Java For Begginers", autor, "tecnologia", true);
        //livro.validarDisponibilidade();
        
        // Criando um Usuario
        Usuario usuario = new Usuario("Jess",21);

        // Criando um Emprestimo
        Emprestimo emprestimo = new Emprestimo((new Date()), (new Date()), livro, usuario); 

        // Exibindo informações
        //System.out.println("Livro: " + livro.getTitulo());
        //System.out.println("Autor: " + livro.getAutor().getNome());
        //System.out.println("Gênero: " + livro.getGenero());
        //System.out.println("Usuário: " + usuario.getNome());
        //System.out.println("Idade: " + usuario.getIdade());
        //System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        //System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
        
        // Criando um artigo
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        
        // Exibindo informações do artigo
        System.out.println("Informações do Artigo");
        System.out.println("   ");
        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Autor: " + artigo.getAutor().getNome());
        System.out.println("Gênero: " + artigo.getGenero());
        artigo.statusPublicado();
        autor.definirUsuario();
    }
}
