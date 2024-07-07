package main.java.set.ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    private final String nome;
    private final long matricula;
    private final double nota;

    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public long getMatricula() {
        return matricula;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    @Override
    public String toString() {
        return "{" + nome + ", " + matricula + ", " + nota + '}';
    }
}
class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}


