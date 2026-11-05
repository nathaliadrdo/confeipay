package br.com.confeipay.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    private final String codigo;
    private final String nome;
    private final BigDecimal preco;
    private final int estoque;
    private final Categoria categoria;

    public Produto(String codigo, String nome, BigDecimal preco, int estoque,Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }


    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public BigDecimal getPreco() { return preco; }
    public int getEstoque() { return estoque; }
    public Categoria getCategoria() { return categoria; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto outro)) return false;
        return Objects.equals(codigo, outro.codigo);
    }

    @Override
    public int hashCode() {
          return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return nome + " (" + codigo + ")";
    }
}