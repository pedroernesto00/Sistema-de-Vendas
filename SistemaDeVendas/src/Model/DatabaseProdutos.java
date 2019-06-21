package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

//Design Pattern Singleton
//Vai gerar/Ler o arquivo que contem o estoque de produtos
//TODO Descobrir uma maneira de ler o arquivo sem gerar um EOF error
//TODO remodelar a classe abstrata Database
public class DatabaseProdutos {

    private static ArrayList<ProdutoModelo> produtos = new ArrayList<>();

    private static DatabaseProdutos estoque = new DatabaseProdutos();

    private DatabaseProdutos() {
        loadData("produtoDatabase.txt");
    }

    public static DatabaseProdutos getInstance() {
        return estoque;
    }

    public static void add(ProdutoModelo produto) {
        produtos.add(produto);
    }

    public static void remove(int id) {
        Iterator itr = produtos.iterator();
        ProdutoModelo produto;
        while (itr.hasNext()) {
            produto = (ProdutoModelo) itr.next();
            if (produto.getId() == id) {
                produtos.remove(produto);
                return;
            }

        }
    }

    public static ProdutoModelo search(int id) {
        for(ProdutoModelo p : produtos){
            if(p.getId() == id) return p;
        }
        return null;
    }

    public static void loadData(String path){
        try{
            File file = new File(path);
            Object obj;
            if(file.exists()) {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objIn = new ObjectInputStream(fileIn);
                while((obj = objIn.readObject()) != null){
                    produtos.add((ProdutoModelo) obj);
                }
                objIn.close();
                fileIn.close();
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void saveData(String path){
        try{
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            for(ProdutoModelo data : produtos){
                objOut.writeObject(data);
            }
            objOut.close();
            fileOut.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }

}
