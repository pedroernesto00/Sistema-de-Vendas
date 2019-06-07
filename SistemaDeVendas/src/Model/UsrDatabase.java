package Model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsrDatabase {

    private HashMap<String, String> login = new HashMap<>();

    public UsrDatabase(String usr, String senha){
        this.login.put(usr, senha);
    }

    public void add(String usr, String senha){
        login.putIfAbsent(usr, senha);
    }

    public void changeSenha(String usr, String senha){
        login.put(usr, senha);
    }

    public void remove(String usr){
        Iterator<Map.Entry<String,String>> iter = login.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            if(entry.getKey().equals(usr)){
                iter.remove();
            }
        }
    }

    public String search(String usr){
        if(login.containsKey(usr)){
            return login.get(usr);
        }
        return null;
    }

}
