package org.example;

import org.example.classes.Boleto;
import org.example.classes.CartaoCredito;
import org.example.classes.Pix;
import org.example.interfaces.MeioPagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        CartaoCredito cartaoCredito = new CartaoCredito(
                100,
                "Cartão de Crédito"
        );

        Pix pix = new Pix(
                100,
                "Pix",
                "ismael@gmail.com"
        );

        Boleto boleto = new Boleto(
                100,
                "Boleto"
        );

        List<MeioPagamento> leia = new ArrayList<>();

        leia.add(cartaoCredito);
        leia.add(pix);
        leia.add(boleto);

        for(MeioPagamento l : leia){
            l.pagar();
        };

    }
}
