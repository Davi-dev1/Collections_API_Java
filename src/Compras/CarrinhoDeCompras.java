package Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Carrinho> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Carrinho(nome, preco, quantidade));

    }

    public void  removerItem(String nome) {
        List<Carrinho> compras = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for (Carrinho c : carrinho) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    compras.add(c);
                }
            }
            carrinho.removeAll(compras);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0d;
        if (!carrinho.isEmpty()) {
            for (Carrinho carrinho : carrinho) {
                double valorItem = carrinho.getPreco() * carrinho.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("O carrinho está vazio! ");
        }
    }

    public void exibirItens() {
        if (!carrinho.isEmpty()){
            System.out.println(this.carrinho);
        }else {
            System.out.println("O carrinho está vazio");
        }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Cereal",16.00,2);
        carrinhoDeCompras.removerItem("Cereal");
        carrinhoDeCompras.adicionarItem("Sucrilios",15.00,4);

        carrinhoDeCompras.adicionarItem("Leite",15.00,2);
        carrinhoDeCompras.adicionarItem("Aveia",5.00,5);

        carrinhoDeCompras.adicionarItem("fones de ouvido",46.00,1);



        carrinhoDeCompras.exibirItens();






        System.out.println("O valor total dos itens do carrinho é " +carrinhoDeCompras.calcularValorTotal());



    }




}
