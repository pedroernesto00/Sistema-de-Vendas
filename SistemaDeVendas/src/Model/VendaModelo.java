package Model;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;
import java.util.ArrayList;

// Como refatorar a classe para que ela fique menor e mais concisa

public class VendaModelo implements Serializable {

    private ArrayList<ItemVenda> itens = new ArrayList<>();
    private int id;
    private String funcionario;
    private String cliente;
    private double valor;

    public VendaModelo(int id, String funcionario, String cliente){
        this.id = id;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.valor = calcValor();
    }

    public ObservableList<ItemVenda> viewItens(){
        return FXCollections.observableArrayList(itens);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void addItem(ItemVenda item){
        itens.add(item);
    }

    public void removeItem(ItemVenda item){
        itens.remove(item);
    }

    private double calcValor(){
        double valor = 0;
//        for(ItemVenda item : itens){
//            valor += item.getValorItem();
//        }
        return valor;
    }

}
