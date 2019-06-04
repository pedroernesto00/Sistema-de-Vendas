import java.util.*;

public class Venda{
    
    List<Produto> venda = new LinkedList<Produto>();
    String vendedor;
    String data;
    double preco_total;
    int quantidade_total;
    
    Venda(String data, String vendedor) {
        this.data = data;
        this.vendedor = vendedor;
    }
    
    void adicionarProduto(Produto p1) {
    	venda.add(p1);
    	this.quantidade_total += 1;
    	this.preco_total += p1.preco;
    }

    void listarProdutos() {
        for (Produto p: venda) {
            System.out.println(p.nome + " - " + p.preco);
        }
    }


    String getData() {
        return this.data;
    }

    String getVendedor() {
        return this.vendedor;
    }

    double getPrecoTotal() {
        return this.preco_total;
    }
    
    int getQuantidadeTotal() {
    	return quantidade_total;
    }
    
}