package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String , Integer> AgendaContatoMap;

    public AgendaContatos() {
        AgendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        AgendaContatoMap.put(nome, telefone);


    }
public void removerContato(String nome){
        if(!AgendaContatoMap.isEmpty()){
            AgendaContatoMap.remove(nome);
            System.out.println("Contato removido com sucesso!!");

        }


}
    public void exibirContatos(){
        System.out.println(AgendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!AgendaContatoMap.isEmpty()){
           numeroPorNome = AgendaContatoMap.get(nome);
        }
      return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();


        agendaContatos.adicionarContato("Luis da Serra",11954321);
        agendaContatos.adicionarContato("Pedro Guilherme",11956565);
        agendaContatos.adicionarContato("Anisio Santos ",119823456);
        agendaContatos.adicionarContato("Marcos ",119432670);
        agendaContatos.exibirContatos();


        agendaContatos.removerContato("Luis da Serra");
        agendaContatos.exibirContatos();

        System.out.println("O número é : "+agendaContatos.pesquisarPorNome("Marcos "));

    }

}
