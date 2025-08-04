package list.OperacoesBasicas;

public class Tarefa {

    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    } //Isso daqui cria o objeto Tarefa

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao;
    }
}
