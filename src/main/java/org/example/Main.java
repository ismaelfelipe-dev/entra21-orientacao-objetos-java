package org.example;

import org.example.classes.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Titular titular = new Titular(
                "João",
                "11111111111",
                LocalDate.of(1990, 5, 10));

        Dependente dependente1 = new Dependente(
                "Maria",
                "22222222222",
                LocalDate.of(2010, 3, 15));

        Dependente dependente2 = new Dependente(
                "Pedro",
                "33333333333",
                LocalDate.of(2012, 8, 20));

        titular.adicionarDependente(dependente1);
        titular.adicionarDependente(dependente2);

        System.out.println(titular);
    }
}