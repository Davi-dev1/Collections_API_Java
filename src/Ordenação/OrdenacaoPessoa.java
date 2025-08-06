package Ordenação;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {


    private List<Pessoa> pessoaList;


    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome,idade, altura));
}
public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura,new ComparatotPorAltura());
        return pessoasPorAltura;




    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Luis ",79,1.68);
        ordenacaoPessoa.adicionarPessoa("Pedro",29,1.80);
        ordenacaoPessoa.adicionarPessoa("Petronius",47,1.60);
        ordenacaoPessoa.adicionarPessoa("Michael",56,1.70);

        //A classe Collections é uma classe utilitária do Java para operações comuns em coleções.
        //Ela fornece métodos para ordenação, busca, manipulação e sincronização de coleções.



        //A ordenação está na ordem crescente por conta do metódo sort()
        //O método sort() é usado para ordenar uma lista em ordem ascendente.
        //O método sort() em conjunto com Collections.reverseOrder() permite ordenar em ordem descendente.

        System.out.println(ordenacaoPessoa.ordernarPorIdade()); // a idade é ordenada da menor para a maior
        System.out.println(ordenacaoPessoa.ordenarPorAltura()); // a altura é ordenada ai do menor para o maior
//git show no terminal mostra o ultimo commit feito

    }

}
