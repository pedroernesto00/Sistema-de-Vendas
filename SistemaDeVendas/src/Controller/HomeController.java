package Controller;

import Model.DatabaseVendas;
import Model.VendaModelo;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class HomeController {
    @FXML
    private Button home;

    @FXML
    private Button venda;

    @FXML
    private Button funcionarios;

    @FXML
    private Button inventario;

    @FXML
    private TableView<VendaModelo> topVendas = new TableView<>();

    @FXML
    private TableColumn<VendaModelo, String> vendaCliente = new TableColumn<>();

    @FXML
    private TableColumn<VendaModelo, String> vendaFuncionario = new TableColumn<>();

    @FXML
    private TableColumn<VendaModelo, Integer> vendaID = new TableColumn<>();

    @FXML
    private TableColumn<VendaModelo, Double> vendaValor = new TableColumn<>();



    public HomeController(){}

    @FXML
    private void initialize(){
        displayTableView();

    }

    private void displayTableView(){
        DatabaseVendas database = DatabaseVendas.getDatabase();
        ObservableList<VendaModelo> list = database.getVendas();
        topVendas.setItems(list);
        vendaValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        vendaCliente.setCellFactory(TextFieldTableCell.forTableColumn());
        vendaCliente.setOnEditCommit((TableColumn.CellEditEvent<VendaModelo, String> edit)-> {
            edit.getTableView().getItems().get(edit.getTablePosition().getRow()).setCliente(edit.getNewValue());
            database.saveData("VendasDatabase.txt");
        });
        vendaID.setCellValueFactory(new PropertyValueFactory<>("id"));
        vendaCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        vendaFuncionario.setCellValueFactory(new PropertyValueFactory<>("funcionario"));
    }




}
