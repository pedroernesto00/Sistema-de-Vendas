package Model;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;

public class DatabaseUsuarios implements Serializable {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static DatabaseUsuarios database = new DatabaseUsuarios();


    private DatabaseUsuarios(){
        loadData("UsrDatabase.txt");
    }

    public static DatabaseUsuarios getDatabase(){
        return DatabaseUsuarios.database;
    }

    public static ObservableList<Usuario> getUsuarios(){
        return FXCollections.observableArrayList(usuarios);
    }

    public void add(String username, String senha, boolean isAdmin){
        for(Usuario usr : usuarios){
            if(usr.getUsername().equals(username)) return;
        }
        Usuario newUsr = new Usuario(username, senha, isAdmin);
        usuarios.add(newUsr);

    }

    public boolean remove(String username){
        for(Usuario usr : usuarios){
            if (usr.getUsername().equals(username)) {
                usuarios.remove(usr);
                return true;
            }
        }
        return false;
    }

    public Usuario search(String username){
        for(Usuario usr : usuarios){
            if(usr.getUsername().equals(username)) return usr;
        }
        return null;
    }

    public static void loadData(String path){
        try {
            File file = new File(path);
            Object obj;
            if(file.exists()) {
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream objIn = new ObjectInputStream(fileIn);
                while((obj = objIn.readObject()) != null){
                    usuarios.add((Usuario) obj);
                }
                objIn.close();
                fileIn.close();
            } else{
                usuarios.add(new Usuario("admin", "admin", true));
                usuarios.add(new Usuario("carlos", "123", false));
                saveData(path);
            }
        } catch (Exception e){
            System.out.println("Erro2 : "+ e);
        }
    }

    public static void saveData(String path){
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            for(Usuario data : usuarios){
                objectOut.writeObject(data);
            }
            objectOut.close();
            fileOut.close();
        } catch (Exception e) {
            System.out.println("Erro1: "+ e);
        }

    }

}
