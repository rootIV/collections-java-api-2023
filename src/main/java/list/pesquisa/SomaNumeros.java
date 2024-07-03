package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int total = 0;

        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                total += numero;
            }
        }

        return total;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;

        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if(numero > maiorNumero){
                    maiorNumero = numero;
                }
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 2147483647;

        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if(numero < menorNumero){
                    menorNumero = numero;
                }
            }
        }

        return menorNumero;
    }

    @Override
    public String toString() {
        return "Numeros: " + numeros;
    }

    public static void main(String[] args) {
        SomaNumeros sn = new SomaNumeros();
        sn.adicionarNumero(1611);
        sn.adicionarNumero(312);
        sn.adicionarNumero(6124);
        sn.adicionarNumero(478);
        sn.adicionarNumero(4567);
        sn.adicionarNumero(753);
        sn.adicionarNumero(6783);

        System.out.println("Soma: " + sn.calcularSoma());
        System.out.println("Maior numero: " + sn.encontrarMaiorNumero());
        System.out.println("Menor numero: " + sn.encontrarMenorNumero());
    }
}