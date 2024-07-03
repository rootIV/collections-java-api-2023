package main.java.list.operacoesBasicas;

public class Item {
    private String descricao;
    private Double preco;
    private int quantidade;

    public Item(String descricao, Double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
