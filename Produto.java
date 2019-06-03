public class Produto {
    float preco;
    int quantidade;
    String nome, descricao;

    Produto (String nome, String descricao, int quantidade, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    void setNome (String nome) {
        this.nome = nome;
    }

    void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }

    void setPreco (float preco) {
        this.preco = preco;
    }
    
    float getPreco() {
        return this.preco;
    }

    String getNome() {
        return this.nome;
    }
    
    int getQuantidade() {
        return this.quantidade;
    }
}