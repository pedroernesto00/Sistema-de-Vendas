package Model;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Iterator;

//Design Pattern Singleton
public class estoqueModelo {

    private static ObservableList<ProdutoModelo> produtos = FXCollections.observableArrayList();

    private static estoqueModelo estoque = new estoqueModelo();

    private estoqueModelo() {
    }

    public static estoqueModelo getInstance() {
        return estoque;
    }

    public static void add(ProdutoModelo produto) {
        produtos.add(produto);
    }

    public static void remove(String nome) {
        Iterator itr = produtos.iterator();
        ProdutoModelo produto;
        while (itr.hasNext()) {
            produto = (ProdutoModelo) itr.next();
            if (produto.getNome().equals(nome)) {
                produtos.removeAll(produto);
                return;
            }

        }
    }

    public static ProdutoModelo search(String nome) {
        Iterator itr = produtos.iterator();
        ProdutoModelo produto;
        while (itr.hasNext()) {
            produto = (ProdutoModelo) itr.next();
            if (produto.getNome().equals(nome)) {
                return produto;
            }

        }
        return null;
    }

}
