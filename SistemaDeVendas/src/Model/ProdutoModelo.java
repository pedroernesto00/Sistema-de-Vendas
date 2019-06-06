package Model;

import javafx.beans.property.*;
public class ProdutoModelo implements Comparable<ProdutoModelo>{

    private SimpleStringProperty nome = new SimpleStringProperty(this, "nome", null);
    private IntegerProperty qtd = new SimpleIntegerProperty(this, "qtd", 0);
    private DoubleProperty valor = new SimpleDoubleProperty(this, "valor", 0);


    public ProdutoModelo(String nome, int qtd, double valor){
        this.nome.set(nome);
        this.qtd.set(qtd);
        this.valor.set(valor);

    }


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

    public double getValor() {
        return valor.get();
    }

    public DoubleProperty valorProperty() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor.set(valor);
    }

    public void add(){
        this.add(1);
    }

    public void add(int qtd){
        setQtd(getQtd() + qtd);
    }

    public void remove(){
        this.remove(1);
    }

    public void remove(int qtd){
        setQtd(getQtd() - qtd);
        checkQtd();
    }

    private boolean checkQtd(){
        if(getQtd() < 0){
            setQtd(0);
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(ProdutoModelo produtoModelo) {
        return (this.getNome()).compareTo(produtoModelo.getNome());
    }
}