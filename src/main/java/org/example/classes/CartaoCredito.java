package org.example.classes;

import org.example.interfaces.MeioPagamento;

public class CartaoCredito implements MeioPagamento {

    private double valor;
    private String tipo;

    public CartaoCredito(double valor, String tipo){
        this.valor = valor;
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void pagar() {
        String formatado = String.format(
                "Pagando R$ %.2f com %s",
                getValor(),
                getTipo()
        );
        System.out.println(formatado);
    }
}
