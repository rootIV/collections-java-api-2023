package main.java.set.ordenacao;

import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new TreeSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunos.isEmpty()) {
            for (Aluno t : alunos) {
                if (t.getMatricula() == matricula) {
                    alunoParaRemover = t;
                    break;
                }
            }

            alunos.remove(alunoParaRemover);
        }
    }

    private Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunos);
    }

    private Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }

    private void exibirAlunos(){
        System.out.println(alunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();
        ga.adicionarAluno("Vitor", 123123132L, 8);
        ga.adicionarAluno("Gustavo", 423123043L, 5);
        ga.adicionarAluno("Pai", 624123003L, 7);
        ga.adicionarAluno("Mãe", 698123010L, 9);

        System.out.println(ga.exibirAlunosPorNome());

        ga.removerAluno(423123043L);

        System.out.println(ga.exibirAlunosPorNota());

        ga.exibirAlunos();
    }
}
