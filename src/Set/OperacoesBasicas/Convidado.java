package Set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;

    private int codigoConvite;


    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }  //se tiver dois códigosdeconvite o programa já vai tirar 1 , porque dois iguais não são aceitos

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    } //usa isso aqui para não mostrar onde o objeto está referenciado na memória do computador, dessa forma o resultado sai mais organizado e formal
}

