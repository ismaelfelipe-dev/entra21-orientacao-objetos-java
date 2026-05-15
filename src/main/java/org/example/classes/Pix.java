package org.example.classes;

import org.example.interfaces.MeioPagamento;

public class Pix implements MeioPagamento {

    private double valor;
    private String tipo;

    private String chave;

    public Pix(double valor, String tipo, String chave){
        this.valor = valor;
        this.tipo = tipo;
        this.chave = chave;
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

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public void pagar() {
        String formatado = String.format(
                "Pagando R$ %.2f via %s. Chave: %s",
                getValor(),
                getTipo(),
                getChave()
        );
        System.out.println(formatado);
    }
}
