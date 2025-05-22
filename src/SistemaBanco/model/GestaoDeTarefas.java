package SistemaBanco.model;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GestaoDeTarefas {
    public static void main(String[] Args) {
        // Criando uma lista de tarefas
        GestaoDeTarefas primeiraLista = new GestaoDeTarefas();
        // Adicionado tarefas
        primeiraLista.adicionarTarefa("Estudar Java", "Alta", 10);
        primeiraLista.adicionarTarefa("Ir pra academia", "Alta", 20);
        primeiraLista.adicionarTarefa("Chutar o Juan", "Media", 30);
        primeiraLista.adicionarTarefa("Bangar o time", "Media", 11);
        primeiraLista.adicionarTarefa("Massagear o gato", "Baixa", 4);
        primeiraLista.adicionarTarefa("Ir a praia", "Baixa", 6);
        // Listando tarefas pela prioridade
        System.out.print("\n");
        primeiraLista.listarTarefas("Alta");
        System.out.print("\n");
        primeiraLista.listarTarefas("Media");
        System.out.print("\n");
        primeiraLista.listarTarefas("Baixa");
        // Concluindo tarefas
        System.out.print("\n");
        primeiraLista.TarefaConcluida("Massagear o gato");
        primeiraLista.TarefaConcluida("Ir pra academia");
        // Listando tarefas pela prioridade
        System.out.print("\n");
        primeiraLista.listarTarefas("Alta");
        System.out.print("\n");
        primeiraLista.listarTarefas("Media");
        System.out.print("\n");
        primeiraLista.listarTarefas("Baixa");
    }

    private List<Tarefa> listinha;

    public GestaoDeTarefas () {
        this.listinha = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao, String prioridade, int id) {
        listinha.add(new Tarefa(descricao, prioridade, id));
        System.out.println("Foi adicionada a tarefa com a descrição : " + descricao + "(ID=" + id + ")");
    }

    public void TarefaConcluida(String descricao) {
        List<Tarefa> listaRemoverTarefa = new ArrayList<>();
        for(Tarefa t : listinha) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setEstado();
                listaRemoverTarefa.add(t);
            }
        }
        listinha.removeAll(listaRemoverTarefa);
        System.out.println("A tarefa com a descrição : " + descricao + " ; Foi concluida com sucesso.");
    }

    public void listarTarefas (String prioridade) {
        System.out.println("Listando tarefas de prioridade " + prioridade + " ordenado pelo ID :");
        List<Tarefa> listaDePrioridade = new ArrayList<>();
        for(Tarefa t : listinha) {
            if(t.getPrioridade().equalsIgnoreCase(prioridade)) {
                listaDePrioridade.add(t);
            }
        }
        Collections.sort(listaDePrioridade);
        for(Tarefa b : listaDePrioridade) {
            System.out.println(b.getDescricao() + " (ID=" + b.getId() + ")");
        }
    }
}

class Tarefa implements Comparable<Tarefa> {
    private String descricao;
    private String prioridade;
    private int id;
    private Boolean concluida;

    public Tarefa(String descricao, String prioridade, int id) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
        this.id = id;
    }

    @Override
    public int compareTo(Tarefa t) {
        return Integer.compare(id, t.getId());
    }

    public void setEstado() {
        this.concluida = true;
    }

    public int getId () {
        return id;
    }

    public Boolean getEstado () {
        return concluida;
    }

    public String getDescricao () {
        return descricao;
    }

    public String getPrioridade () {
        return prioridade;
    }
}
