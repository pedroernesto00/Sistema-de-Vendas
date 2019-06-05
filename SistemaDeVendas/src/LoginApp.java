import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.*;

public class LoginApp extends Application {

    private HBox btnPanel;
    private Label login;
    private GridPane pane;
    private TextField usrFld;
    private PasswordField pswFld;
    private Button btnLogin, btnExit;
    private static Stage stage;

    private void initComponents(){
        pane = new GridPane();
        pane.setPrefSize(1000, 200);
        pane.setStyle("-fx-background-color: #141e30;");

        login = new Label("Sign In");
        login.setStyle("-fx-text-fill: #ffffff");

        usrFld = new TextField();
        usrFld.setPromptText("Usuario");
        pswFld = new PasswordField();
        pswFld.setPromptText("Senha");
        btnLogin = new Button("Login");
        btnExit = new Button("Exit");
        btnPanel = new HBox();

    }

    private void initLayout(){
        pane.setHgap(1);
        pane.setVgap(10);
        pane.setAlignment(Pos.CENTER);
        pane.setHalignment(login, HPos.CENTER);
        btnPanel.getChildren().addAll(btnLogin, btnExit);
        btnPanel.setSpacing(5);
        pane.add(login, 0, 0);
        pane.add(usrFld, 0, 1);
        pane.add(pswFld, 0, 2);
        pane.add(btnPanel, 0, 3);

    }

    private void initListeners(){
        btnExit.setOnAction(e -> Platform.exit());
        btnLogin.setOnAction(e -> logar());
    }

    private void logar(){
        if(usrFld.getText().equals("Admin") && pswFld.getText().equals("Admin")){
            // TODO Abrir nova janela
        } else{
            JOptionPane.showMessageDialog(null,
                    "Login e/ou senha inválidos",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    @Override
    public void start(Stage stage) throws Exception{
        initComponents();
        initListeners();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Login - Sistema de Vendas");
        initLayout();
        stage.show();
        LoginApp.stage = stage;
    }
}
