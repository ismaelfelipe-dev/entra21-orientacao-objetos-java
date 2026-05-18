package org.example.classes;

import org.example.interfaces.MeioPagamento;

public class Boleto implements MeioPagamento {

    @Override
    public void pagar(double valor) {
        String formatado = String.format(
                "Gerando %s de R$ %.2f",
                tipo(),
                valor
        );
        System.out.println(formatado);
    }

    @Override
    public String tipo() {
        return "Boleto";
    }
}
