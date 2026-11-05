package br.com.confeipay;

import br.com.confeipay.domain.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Dia2Demo {
    public static void main(String[] args) {
        String a = "bolo";
        String b = "bolo";
        String c = new String("bolo");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        Integer x = 1000;
        Integer y = 1000;
        System.out.println(x == y);
        System.out.println(x.equals(y));

        Produto p1 = new Produto("BRI-01", "Brigadeiro", new BigDecimal("3.50"), 40, Categoria.DOCE);
        Produto p2 = new Produto("BRI-01", "Brigadeiro gourmet", new BigDecimal("4.00"), 10, Categoria.DOCE);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Set<Produto> catalogo = new HashSet<>();
        catalogo.add(p1);
        catalogo.add(p2);
        System.out.println(catalogo.size());

        EnderecoEntrega e1 = new EnderecoEntrega("Rua das Flores, 10", "São Paulo", "04700000");
        EnderecoEntrega e2 = new EnderecoEntrega("Rua das Flores, 10", "São Paulo", "04700000");
        System.out.println(e1.equals(e2));
        System.out.println(e1);
        try {
            new EnderecoEntrega("Rua X", "São Paulo", "123");
        } catch (IllegalArgumentException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}