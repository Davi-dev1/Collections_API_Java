package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosPalavrasUnicas {

     private Set<String> palavraUnicaSet;

     public ConjuntosPalavrasUnicas(){
         this.palavraUnicaSet = new HashSet<>();

     }


public void adicionarPalavra(String palavra){
  palavraUnicaSet.add(palavra);
}
public void removerPalavra(String palavra){
   if (!palavraUnicaSet.isEmpty()){
       if (palavraUnicaSet.contains(palavra)){
           palavraUnicaSet.remove(palavra);
       }else{
           System.out.println("Não há palavras para remover");
       }
   }
}
public boolean verificarPalavar(){
    return palavraUnicaSet.contains(palavraUnicaSet);

}



    public void exibirPalavraUnica(){
    if (!palavraUnicaSet.isEmpty()){
        System.out.println(palavraUnicaSet);
    }else{
        System.out.println("Não há palavras para mostrar");
    }




}



    public static void main(String[] args) {
        ConjuntosPalavrasUnicas conjuntosPalavrasUnicas = new ConjuntosPalavrasUnicas();

        conjuntosPalavrasUnicas.adicionarPalavra("Ozzy");
        conjuntosPalavrasUnicas.adicionarPalavra("james");
        conjuntosPalavrasUnicas.adicionarPalavra("Dio");
        conjuntosPalavrasUnicas.adicionarPalavra("Fredie");
        conjuntosPalavrasUnicas.adicionarPalavra("Luis ");


        conjuntosPalavrasUnicas.exibirPalavraUnica();



        conjuntosPalavrasUnicas.removerPalavra("Luis");


    }

}
