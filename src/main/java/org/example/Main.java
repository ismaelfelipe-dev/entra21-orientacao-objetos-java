package org.example;

import org.example.classes.Boleto;
import org.example.classes.CartaoCredito;
import org.example.classes.Pix;
import org.example.interfaces.MeioPagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<MeioPagamento> leia = new ArrayList<>();

        leia.add(new CartaoCredito());
        leia.add(new Pix());
        leia.add(new Boleto());

        for(MeioPagamento l : leia){
            l.pagar(100.0);
            System.out.println();
        };

    }
}
