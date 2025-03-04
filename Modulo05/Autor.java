package com.mycompany.app.Model;

import com.mycompany.app.Interface.PublicavelInterface;

public class Autor extends Pessoa {
    private String nacionalidade;
    private PublicavelInterface estrategiaPublicacao;

    public void setEstrategiaPublicacao(PublicavelInterface estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    public void publicar() {
        
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }

    // Construtor com nome e nacionalidade

    public Autor(String nome, String nacionalidade) {
        super(nome);
        //  Chama o construtor da classe Pessoa para inicializar o nome
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private Livro[] obrasPublicadas;

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void setObrasPublicadas(Livro[] obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        // Lógica para retornar as obras publicadas por gênero
        return null;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }


}
