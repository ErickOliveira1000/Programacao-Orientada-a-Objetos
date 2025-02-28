package com.mycompany.app.Model;

public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean isUsuario; // Novo campo para indicar se é um usuário ou autor tradicional

    // Construtor com nome e nacionalidade

    public Autor(String nome, String nacionalidade, boolean isUsuario) {
        super(nome);
        //  Chama o construtor da classe Pessoa para inicializar o nome
        this.nacionalidade = nacionalidade;
        this.isUsuario = isUsuario;
    }
    
    // Getters e Setters

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean getUsuario() {
        return isUsuario;
    }

    public void setUsuario(boolean isUsuario) {
        this.isUsuario = isUsuario;
    }

    public String toString(){
        return this.getNome();
    }

    // Método definirUsuario

    public void definirUsuario() {
        if (isUsuario) {
            System.out.println("Autor Tradicional");
        } else {
            System.out.println("Usuário");
        }
    }
   
}
