package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }

            tarefasSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Lista de tarefas vazia.");
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (!t.getConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
        } else {
            System.out.println("Lista de tarefas vazia.");
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao) && !t.getConcluida()) {
                    t.setConcluida(true);
                }
            }
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao) && t.getConcluida()) {
                    t.setConcluida(false);
                }
            }
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();
        lt.adicionarTarefa("Dormir");
        lt.adicionarTarefa("Acordar");
        lt.adicionarTarefa("Comer");
        lt.adicionarTarefa("Fumar");
        lt.adicionarTarefa("Estudar");
        lt.adicionarTarefa("Entreter");

        lt.exibirTarefas();

        System.out.println("Pendentes: " + lt.obterTarefasPendentes());

        lt.marcarTarefaConcluida("Dormir");
        lt.marcarTarefaConcluida("Acordar");
        lt.marcarTarefaConcluida("Comer");

        System.out.println("Concluidas: " + lt.obterTarefasConcluidas());

        System.out.println("Quantidade de tarefas: " + lt.contarTarefas());

        lt.marcarTarefaPendente("Fumar");
        lt.marcarTarefaPendente("Estudar");

        System.out.println("Pendentes: " + lt.obterTarefasPendentes());

        lt.exibirTarefas();

        lt.removerTarefa("Entreter");

        lt.exibirTarefas();

        System.out.println("Quantidade de tarefas: " + lt.contarTarefas());

        lt.limparListaTarefas();
        lt.exibirTarefas();

    }
}
