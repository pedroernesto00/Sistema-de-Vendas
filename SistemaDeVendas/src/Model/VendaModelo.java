package Model;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class VendaModelo{
    private String funcionario;
    private ObservableList<ProdutoModelo> listaDeProdutos = FXCollections.observableArrayList();
    private int id;
    private int valor;

    public VendaModelo(String nome, ProdutoModelo produto, int id, int valor){

    }

}
