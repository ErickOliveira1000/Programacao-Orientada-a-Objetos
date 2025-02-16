import java.util.Date;

public class Emprestimo {
private Date dataRetirada;
private Date dataDevolucao;
private Livro livro;
private Usuario usuario;

public Date getDataRetirada() {
return dataRetirada;
}

public void setDataRetirada(Date dataRetirada) {
this.dataRetirada = dataRetirada;
}

public Date getDataDevolucao() {
return dataDevolucao;
}

public void setDataDevolucao(Date dataDevolucao) {
this.dataDevolucao = dataDevolucao;
}

public void imprimirInformacoes() {

System.out.println("Data de retirada: " + getDataRetirada());

System.out.println("Data de devolução: " + getDataDevolucao());

}

}
