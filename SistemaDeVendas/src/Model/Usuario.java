package Model;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String username, senha;
    private boolean isAdmin = false;

    public Usuario(String nome, String senha, boolean isAdmin){
        this.username = nome;
        this.senha = senha;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
