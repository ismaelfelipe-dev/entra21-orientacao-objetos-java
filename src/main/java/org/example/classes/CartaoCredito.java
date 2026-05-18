package org.example.classes;

import org.example.interfaces.MeioPagamento;

public class CartaoCredito implements MeioPagamento {

    @Override
    public void pagar(double valor) {
        String formatado = String.format(
                "Pagando R$ %.2f com %s",
                valor,
                tipo()
        );
        System.out.println(formatado);
    }

    @Override
    public String tipo() {
        return "Cartão de Crédito";
    }
}
