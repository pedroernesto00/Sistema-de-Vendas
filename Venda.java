import java.util.*;

public class Venda implements Comparator{
    
    List<Produto> venda = new LinkedList<Produto>();
    String vendedor;
    Date data;
    double total;
    
    Venda(Date data, String vendedor) {
        this.data = data;
        this.vendedor = vendedor;
    }
    

    void listarProdutos() {
        for (Produto p: venda) {
            System.out.println(p.nome + " - " + p.preco);
        }
    }

    void setTotal() {
        for (Produto p : venda) {
            this.total += p.preco;
        }
    }

    Date getData() {
        return this.data;
    }

    String getVendedor() {
        return this.vendedor;
    }

    double getTotal() {
        return this.total;
    }
    
    
}