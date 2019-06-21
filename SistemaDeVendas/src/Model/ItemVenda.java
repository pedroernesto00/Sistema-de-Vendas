package Model;

import java.util.Date;

public class ItemVenda{
    private String nome;
    private int qtd;
    private double valorItem;

    public ItemVenda(String nome, int qtd, double valor){
        this.nome = nome;
        this.qtd = qtd;
        this.valorItem = valor*qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }


}
