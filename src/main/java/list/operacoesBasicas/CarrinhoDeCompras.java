package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void AdicionarItem(String nome, double preco, int quantidade){
        if(!nome.isEmpty() && preco > 0 && quantidade > 0){
            itemList.add(new Item(nome, preco, quantidade));
        }
    }

    public void RemoverItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item t : itemList){
            if(t.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(t);
            }
        }

        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        for(Item t : itemList){
            if(t.getQuantidade() > 1){
                valorTotal += t.getPreco() * t.getQuantidade();
            }else{
                valorTotal += t.getPreco();
            }
        }

        return valorTotal;
    }

    public void exibirItens(){
        for(Item t : itemList){
            System.out.println(t.getNome() + ": R$" + t.getPreco() + " (" + t.getQuantidade() + ").");
        }

        System.out.println("Valor total: " + calcularValorTotal());
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cc = new CarrinhoDeCompras();
        cc.AdicionarItem("Pão", 7.85, 2);
        cc.AdicionarItem("Coxinha", 6.12, 2);
        cc.AdicionarItem("Suco", 5.65, 1);
        cc.AdicionarItem("Pringles", 12.99, 1);

        cc.RemoverItem("Pão");

        cc.exibirItens();
    }
}
