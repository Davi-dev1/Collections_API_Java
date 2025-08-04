package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();}

        public void adicionarLivro(String titulo,String autor, int anoPublicacao){
          livroList.add(new Livro(titulo,autor,anoPublicacao));
        }
        public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro>livrosPorautor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorautor.add(l);
                }
            }

        }
            return livrosPorautor;
        }
        public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
            List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

            if (!livroList.isEmpty()) {
                for (Livro l : livroList) {
                    if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                        livrosPorIntervaloAnos.add(l);
                    }

                }
            }
            return livrosPorIntervaloAnos;
        }

        public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null; //aqui esta nulo porque não temos nenhum objeto livro a partir desse metodo

    if (!livroList.isEmpty()){
        for (Livro l : livroList){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
            }
        }
    }
       return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 1 ","Autor 1 ", 1900);
        catalagoLivros.adicionarLivro("Livro 1 ","Autor 2 ", 1850);
        catalagoLivros.adicionarLivro("Livro 2","Autor 2 ", 2025);
        catalagoLivros.adicionarLivro("Livro 3 ","Autor 3 ", 2077);
        catalagoLivros.adicionarLivro("Livro 4 ","Autor 4 ", 1915);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2 "));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(1850, 2025));
        System.out.println(catalagoLivros.pesquisarPorTitulo("livro 1 ")); // a ordem de armazenamento de listas é a ordem da prioridade por mais que tenhamos 2 livros de mesmo nome

    }



    }
