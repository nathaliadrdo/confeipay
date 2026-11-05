package br.com.confeipay.domain;

public record EnderecoEntrega(String rua, String cidade, String cep) {

    public EnderecoEntrega {
        if (cep == null || !cep.matches("\\d{8}")) {
            throw new IllegalArgumentException("CEP deve ter 8 dígitos");
        }
    }
}