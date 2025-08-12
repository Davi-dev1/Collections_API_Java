package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {   //temos que criar um construtor e instanciar um hashset vazio
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);

    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                 //o equalsIgnoreCase compara se um é igual ao outro.
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos =new AgendaContatos();

        agendaContatos.adicionarContato("Pedro",1222222);
        agendaContatos.adicionarContato("Luis",289898);
        agendaContatos.adicionarContato("marge",151611);
        agendaContatos.adicionarContato("Andre",1221);
        agendaContatos.adicionarContato("Andre",133333);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("marge"));

        System.out.println(agendaContatos.atualizarNumeroContato("marge", 12344));



    }
}