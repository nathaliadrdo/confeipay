package br.com.confeipay.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final Cliente cliente;
    private final List<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status = StatusPedido.CRIADO;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public BigDecimal subtotal() {
        BigDecimal soma = BigDecimal.ZERO;
        for (ItemPedido item : itens) {
            soma = soma.add(item.subtotal());
        }
        return soma;
    }

    public BigDecimal total() {
        BigDecimal subtotal = subtotal();
        if (subtotal.compareTo(new BigDecimal("200")) > 0) {
            return subtotal.multiply(new BigDecimal("0.95")).setScale(2, RoundingMode.HALF_UP);
        }
        return subtotal.setScale(2, RoundingMode.HALF_UP);
    }

    public Cliente getCliente() { return cliente; }
    public StatusPedido getStatus() { return status; }


}