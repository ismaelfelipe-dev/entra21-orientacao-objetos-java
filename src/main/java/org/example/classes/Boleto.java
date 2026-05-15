package org.example.classes;

import org.example.interfaces.MeioPagamento;

public class Boleto implements MeioPagamento {

    private double valor;
    private String tipo;

    public Boleto(double valor, String tipo){
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
                "Gerando %s R$ %.2f",
                getTipo(),
                getValor()
        );
        System.out.println(formatado);
    }
}
