package br.com.confeipay.domain;

public class EstoqueInsuficienteException extends RuntimeException {

    public EstoqueInsuficienteException(String produto, int disponivel, int solicitado) {
        super(String.format("Estoque insuficiente de %s: disponível %d, solicitado %d",
                produto, disponivel, solicitado));
    }


}