import java.util.Date;

public class Main {
public static void main(String[] args) {

Date data = new Date();

Livro[] livrosPublicados = {};

Autor autor = new Autor("Brasileiro", livrosPublicados);
autor.setNome("João da Silva");

Livro livro = new Livro();
livro.setTitulo("Java for Beginners");
livro.setAutor(autor);
livro.setGenero("Tecnologia");

livro.validarDisponibilidade();
livro.imprimirInformacoes();

Usuario usuario = new Usuario();
usuario.setNome("Erick");
usuario.setIdade(34);

usuario.imprimirInformacoes();

Emprestimo emprestimo = new Emprestimo();
emprestimo.setDataRetirada(data);
emprestimo.setDataDevolucao(data);

emprestimo.imprimirInformacoes();
}

}
