import javafx.beans.property.*;
public class ProdutoModelo implements Comparable<ProdutoModelo>{

    private SimpleStringProperty nome = new SimpleStringProperty(this, "nome", "vazio");
    private IntegerProperty qtd = new SimpleIntegerProperty(this, "qtd", 0);


    public String getNome() {
        return nome.get();
    }

    public SimpleStringProperty nomeProperty() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public int getQtd() {
        return qtd.get();
    }

    public IntegerProperty qtdProperty() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd.set(qtd);
    }





    @Override
    public int compareTo(ProdutoModelo produtoModelo) {
        return (this.getNome()).compareTo(produtoModelo.getNome());
    }
}