package SistemaBanco.model;
import java.util.List;
import java.util.ArrayList;

public class GestaoDeTarefas {
    public static void main(String[] Args) {
        // Criando uma lista de tarefas
        GestaoDeTarefas primeiraLista = new GestaoDeTarefas();
        // Adicionado tarefas
        primeiraLista.adicionarTarefa("Estudar Java", "Alta");
        primeiraLista.adicionarTarefa("Ir pra academia", "Alta");
        primeiraLista.adicionarTarefa("Chutar o Juan", "Media");
        primeiraLista.adicionarTarefa("Massagear o gato", "Baixa");
        primeiraLista.adicionarTarefa("Ir a praia", "Baixa");
        // Concluindo tarefas
        primeiraLista.TarefaConcluida("Massagear o gato");
        primeiraLista.TarefaConcluida("Estudar Java");
        // Listando tarefas pela prioridade
        primeiraLista.listarTarefas("Alta");
        primeiraLista.listarTarefas("Media");
        primeiraLista.listarTarefas("Baixa");
    }

    private List<Tarefa> listinha;

    public GestaoDeTarefas () {
        this.listinha = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao, String prioridade) {
        listinha.add(new Tarefa(descricao, prioridade));
        System.out.println("Foi adicionada a tarefa com a descrição : " + descricao);
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
        System.out.println("Listando tarefas de prioridade " + prioridade);
        for(Tarefa t : listinha) {
            if(t.getPrioridade().equalsIgnoreCase(prioridade)) {
                System.out.println(t.getDescricao());
            }
        }
    }
}

class Tarefa {
    private String descricao;
    private String prioridade;
    private Boolean concluida;

    public Tarefa(String descricao, String prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public void setEstado() {
        this.concluida = true;
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
