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
        if(!itemList.isEmpty()){
            for(Item t : itemList){
                if(t.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(t);
                }
            }
        }
        else{
            System.out.println("Lista vazia!/Não há itens para remover./Não encontrado!");
        }

        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;

        if(!itemList.isEmpty()) {
            for (Item t : itemList) {
                double quantidadeValor = t.getQuantidade() * t.getPreco();
                valorTotal += quantidadeValor;
            }

            return valorTotal;
        }
        else {
            throw new RuntimeException("Lista vazia!/Não há itens para calcular./Não encontrado!");
        }
    }

    public void exibirItens(){
        if(!itemList.isEmpty()){
            //for (Item t : itemList) {
            //System.out.println(t.getNome() + ": R$" + t.getPreco() + " (" + t.getQuantidade() + ").");
            //}
            System.out.println(this.itemList);
            System.out.println("Valor total: " + calcularValorTotal());
        }
    }

    @Override
    public String toString() {
        return String.format("itemList toString() padrão: %s", itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cc = new CarrinhoDeCompras();
        cc.AdicionarItem("Pão", 7.85, 2);
        cc.AdicionarItem("Coxinha", 6.12, 2);
        cc.AdicionarItem("Suco", 5.65, 1);
        cc.AdicionarItem("Pringles", 12.99, 1);
        cc.RemoverItem("Pão");

        cc.exibirItens();

        CarrinhoDeCompras cc2 = new CarrinhoDeCompras();
        cc2.AdicionarItem("Bolo", 14.85, 2);
        cc2.AdicionarItem("Doritos", 8.12, 2);
        cc2.AdicionarItem("Refrigerante", 11.65, 1);
        cc2.AdicionarItem("Gelatina", 4.99, 1);
        cc2.RemoverItem("Gelatina");

        cc2.exibirItens();

        System.out.println(cc.toString());
        System.out.println(cc2.toString());
    }
}
