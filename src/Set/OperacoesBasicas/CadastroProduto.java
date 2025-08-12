package Set.OperacoesBasicas;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto>produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>( );
    }

    public void adicionarProduto(String nome,long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome,codigo,preco,quantidade));
    }
public Set<Produto>exibirProdutosPorNome(){
Set<Produto>produtosPorNome = new TreeSet<>(produtoSet); //usamos o treeset pq queremos organizar nosso produtos por nome,ou seja como estamos trabalhando com set o treeset organiza os nossos produtos de forma correta através do nome deles
return  exibirProdutosPorNome();
    }
    public Set<Produto>exibirPorPreco(){
        Set<Produto>produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();


        cadastroProduto.adicionarProduto("Mandioca" ,1L,12.00,13333);
        cadastroProduto.adicionarProduto("Playstation" ,5L,5.000,120);
        cadastroProduto.adicionarProduto("RTX 4090" ,3L,24.000,25);
        cadastroProduto.adicionarProduto("Mandioca" ,1L,12.00,13333);

        System.out.println(cadastroProduto.produtoSet);


        System.out.println(cadastroProduto.exibirPorPreco());

        System.out.println(cadastroProduto.exibirProdutosPorNome());


    }

//TODO : Criar um comparable para os outros
}
