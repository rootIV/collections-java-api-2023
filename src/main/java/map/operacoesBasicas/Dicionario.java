package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        } else{
            System.out.println("Dicionário vazio ou palavra não encontrada.");
        }
    }

    public void exibirPalavras(){
        if(!dicionario.isEmpty()) {
            System.out.println(dicionario);
        } else {
            System.out.println("Dicionário vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraEncontrada = dicionario.get(palavra);
        if(!dicionario.isEmpty()) {
            if (palavraEncontrada != null) {
                return palavraEncontrada;
            }
        }

        return "Dicionário vazio ou palavra não encontrada.";
    }

    public static void main(String[] args) {
        Dicionario dic = new Dicionario();
        dic.adicionarPalavra("Valorant", "Ruim");
        dic.adicionarPalavra("WoW", "Bom");
        dic.adicionarPalavra("Aika", "Ótimo");
        dic.adicionarPalavra("Point Blank", "Maravilhoso");

        System.out.println(dic.pesquisarPorPalavra("Point Blank"));

        dic.removerPalavra("Valorant");
        dic.exibirPalavras();
    }
}
