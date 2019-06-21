package Controller;

import Model.AlertHelper;
import Model.DatabaseUsuarios;
import Model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;


public class LoginController {
    @FXML
    private TextField usrFld;

    @FXML
    private PasswordField passFld;

    @FXML
    private Button loginBtn;

    private DatabaseUsuarios database = DatabaseUsuarios.getDatabase();

    @FXML
    public void handleLogin(){
        // Acess the database looking for the key:value
        // if exists return go for the main page
        // else raise an error screen
        Window window = loginBtn.getScene().getWindow();
        String username = usrFld.getText();
        String senha = passFld.getText();
        Usuario user = database.search(username);
        if(user != null && user.getSenha().equals(senha)){
            try {
                Stage stage = (Stage) loginBtn.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("../View/HomeView.fxml"));
                stage.setScene(new Scene(root, 1200,600 ));
                stage.setTitle("Sistem de Vendas");
                stage.show();
            } catch (IOException e){
                System.out.println(e);
            }

            System.out.println("Logado");
        } else {
            AlertHelper.showAlert(Alert.AlertType.ERROR, window, "Login Error", "Usuario ou senha incorretos");
        }

    }

    public void openApp(){

    }
}
