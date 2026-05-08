package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        CartaoCredito cartao = new CartaoCredito(
           "5223 5000 7897 0794",
                "Flafinho",
                5000
        );

        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento(cartao);

        processadorPagamento.executarVenda(2000);
        System.out.println(cartao.getLimiteDisponivel());
        processadorPagamento.executarVenda(4000);
        System.out.println(cartao.getLimiteDisponivel());

    }
}