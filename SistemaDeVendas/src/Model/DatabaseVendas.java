package Model;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.ArrayList;

public class DatabaseVendas{
    private static DatabaseVendas database = new DatabaseVendas();
    private ArrayList<VendaModelo> vendas =new ArrayList<>();


    public static DatabaseVendas getDatabase(){
        return database;
    }

    public ObservableList<VendaModelo> getVendas(){return FXCollections.observableArrayList(vendas);}

    private DatabaseVendas(){
        loadData("VendasDatabase.txt");
    }

    public void add(VendaModelo venda){
        vendas.add(venda);
    }

    public void remove(VendaModelo venda){
        vendas.remove(venda);
    }

    public VendaModelo search(int id){
        for(VendaModelo venda : vendas){
            if(venda.getId() == id) return venda;
        }
        return null;
    }

    public void loadData(String path){
        try {
            File file = new File(path);
            Object obj;
            if(file.exists()) {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objIn = new ObjectInputStream(fileIn);
                while((obj = objIn.readObject()) != null){
                    vendas.add((VendaModelo) obj);
                }
                objIn.close();
                fileIn.close();
            } else{
                vendas.add(new VendaModelo(2, "Carlos", "Jose"));
                saveData(path);
            }
        } catch (Exception e){
            System.out.println("Erro2 : "+ e);
        }
    }

    public void saveData(String path){
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            for(VendaModelo data : vendas){
                objectOut.writeObject(data);
            }
            objectOut.close();
            fileOut.close();
        } catch (Exception e) {
            System.out.println("Erro10: "+ e);
        }
    }



}
