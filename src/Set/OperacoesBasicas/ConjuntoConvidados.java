package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {


    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }


    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));

    }


    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        //podem existir 2 usuarios de mesmo nome ai para diferenciar esses dois é através do códgio do convite que é diferente
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
            }
            convidadoSet.remove(convidadoParaRemover);


    }
    public int  contarConvidados(){return convidadoSet.size();}

public void exibirConvidados(){
    System.out.println(convidadoSet);
}


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados =  new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Pedro",123);
        conjuntoConvidados.adicionarConvidado("Alvo Dumbledore",777 );
        conjuntoConvidados.adicionarConvidado("Ozzy Osbourne", 666);
        conjuntoConvidados.adicionarConvidado("Bilbo Bolseiro",3677);


        System.out.println("No momento temos : "+conjuntoConvidados.contarConvidados() + " convidados , dentro do seu Set convidados");


        conjuntoConvidados.removerConvidadoPorCodigoConvite(777);
        System.out.println("No momento agora, temos : " +conjuntoConvidados.contarConvidados() + " convidados , dentro do seu Set Convidados");
        conjuntoConvidados.exibirConvidados();



    }

}
