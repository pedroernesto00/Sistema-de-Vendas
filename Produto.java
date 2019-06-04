public class Produto {
    double preco;
    int quantidade;
    String nome, descricao;

    Produto (String nome, String descricao, int quantidade, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    Produto (String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    void setNome (String nome) {
        this.nome = nome;
    }

    void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }

    void setPreco (double preco) {
        this.preco = preco;
    }
    
    double getPreco() {
        return this.preco;
    }

    String getNome() {
        return this.nome;
    }
    
    int getQuantidade() {
        return this.quantidade;
    }

     void decremento() {
    	this.quantidade -= 1;
    }
}