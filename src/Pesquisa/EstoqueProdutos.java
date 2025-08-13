package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {


    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();


    }


    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));


    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalestoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalestoque += p.getQuantidade() * p.getPreco();
            } //basicamente esse código percorre todos os produtos e faz a multiplicação para saber o valor total deles;
        }
        return valorTotalestoque;
    }

    public Produto obterProdutoMaisCaro() {

        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {

                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }

            }
        }
        return produtoMaisCaro;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "playstation", 12, 955);
        estoqueProdutos.adicionarProduto(2L, "playstation 2", 40, 655);
        estoqueProdutos.adicionarProduto(3L, "playstation 3", 30, 500);
        estoqueProdutos.adicionarProduto(4L, "playstation 4", 40, 1.955);
        estoqueProdutos.adicionarProduto(5L, "playstation 5", 20, 5.955);

     estoqueProdutos.exibirProdutos();

        System.out.println("Valor total dos produtos é : "+estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro  é : " +estoqueProdutos.obterProdutoMaisCaro());






    }
}
