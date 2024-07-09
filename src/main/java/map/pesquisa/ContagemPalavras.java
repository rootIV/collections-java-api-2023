package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private final Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        } else {
            System.out.println("Lista vazia ou palavra não encontrada.");
        }
    }

    public Integer exibirContagemPalavras() {
        int count = 0;
        if (!palavras.isEmpty()) {
            for(Integer quantidade : palavras.values()){
                count += quantidade;
            }
            //return palavras.size();
        }

        return count;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        Integer maiorValor = 0;
        if (!palavras.isEmpty()) {
            for (Map.Entry<String, Integer> map : palavras.entrySet()){
                if(map.getValue() > maiorValor){
                    maiorValor = map.getValue();
                    palavraMaisFrequente = map.getKey();
                }
            }
        } else {
            System.out.println("Lista vazia.");
        }

        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras cp = new ContagemPalavras();

        cp.adicionarPalavra("Vitor", 54);
        cp.adicionarPalavra("Gustavo", 45);
        cp.adicionarPalavra("Poliana", 99);
        cp.adicionarPalavra("Elbert", 75);

        cp.removerPalavra("Vitor");

        System.out.println("Total: " + cp.exibirContagemPalavras() + " palavras.");

        System.out.println("A palavra mais frequente: " + cp.encontrarPalavraMaisFrequente());
    }
}
