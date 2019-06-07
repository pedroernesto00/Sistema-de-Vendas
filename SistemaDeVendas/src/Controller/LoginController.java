package Controller;
import Model.*;
import View.*;
import javafx.application.Platform;


public class LoginController {
    private UsrDatabase model = new UsrDatabase("Admin", "Admin");
    private LoginView view = new LoginView();

    public boolean checkLogin(){
        String senha = model.search(view.getUsrFld().getText());
        if(view.getPswFld().getText().equals(senha)){

        }
        return false;
    }

    public void initListenrs(){
        view.getBtnLogin().setOnAction(e -> checkLogin());
        view.getBtnExit().setOnAction(e -> Platform.exit());
    }

}
