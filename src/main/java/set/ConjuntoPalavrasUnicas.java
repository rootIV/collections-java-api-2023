package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicas.isEmpty()) {
            palavrasUnicas.remove(palavra);
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        String message = !palavrasUnicas.isEmpty() ? palavrasUnicas.toString() : "Set vazio!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Samsung");
        palavrasUnicas.adicionarPalavra("Vaio");
        palavrasUnicas.adicionarPalavra("Dell");
        palavrasUnicas.adicionarPalavra("Asus");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("Dell");
        palavrasUnicas.exibirPalavrasUnicas();

        System.out.printf("Tem notebook %s: %s%n", "Samsung", palavrasUnicas.verificarPalavra("Samsung"));;
        System.out.printf("Tem notebook %s: %s%n", "Dell", palavrasUnicas.verificarPalavra("Dell"));;

        palavrasUnicas.exibirPalavrasUnicas();
    }
}
