package Model;

import javafx.beans.property.*;

public class VendaModelo{
    private ProdutoModelo produto;
    private IntegerProperty id = new SimpleIntegerProperty(this, "id", 0);
    private IntegerProperty valor = new SimpleIntegerProperty(this, "valor", 0);

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public int getValor() {
        return valor.get();
    }

    public IntegerProperty valorProperty() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor.set(valor);
    }
}
