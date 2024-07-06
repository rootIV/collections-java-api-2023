package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> nums;

    public OrdenacaoNumeros() {
        this.nums = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        nums.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeros = new ArrayList<>(this.nums);
        if(!nums.isEmpty()){
            Collections.sort(numeros);
            return numeros;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numeros = new ArrayList<>(this.nums);
        if(!nums.isEmpty()){
            numeros.sort(Collections.reverseOrder());
            return numeros;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibirNumeros() {
        if (!nums.isEmpty()) {
            System.out.println(this.nums);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.ordenarDescendente());
    }
}
