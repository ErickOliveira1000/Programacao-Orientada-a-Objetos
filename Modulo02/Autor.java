public class Autor extends Pessoa {
private String nacionalidade;
private Livro[] obrasPublicadas;

public Autor (String nacionalidade, Livro[] obrasPublicadas) {
this.nacionalidade = nacionalidade;
this.obrasPublicadas = obrasPublicadas;
} 

public String getNacionalidade() {
return nacionalidade;
}

public void setNacionalidade(String nacionalidade) {
this.nacionalidade = nacionalidade;
}

public Livro[] getObrasPublicadas() {
return obrasPublicadas;
}

public void setObrasPublicadas(Livro[] obrasPublicadas) {
this.obrasPublicadas = obrasPublicadas;
}

public String toString(){
return this.getNome();
}

}
