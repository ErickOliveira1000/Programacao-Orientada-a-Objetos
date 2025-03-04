package com.mycompany.app.Estrategia;

import com.mycompany.app.Interface.PublicavelInterface;

public class EstrategiaPublicacaoArtigo extends PublicavelInterface {
    @Override
    public void publicar() {
        System.out.println("Publicando um artigo...");
    }
}

