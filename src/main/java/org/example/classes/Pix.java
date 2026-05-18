package org.example.classes;

import org.example.interfaces.MeioPagamento;

public class Pix implements MeioPagamento {

    @Override
    public void pagar(double valor) {
        String formatado = String.format(
                "Pagando R$ %.2f via %s. Chave: 47898248351",
                valor,
                tipo()
        );
        System.out.println(formatado);
    }

    @Override
    public String tipo() {
        return "Pix";
    }
}
