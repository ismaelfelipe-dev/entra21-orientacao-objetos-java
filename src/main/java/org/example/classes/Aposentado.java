package org.example.classes;

import java.time.LocalDate;

public class Aposentado extends Titular{

    public Aposentado(String nome, String cpf, LocalDate dataDeNascimento) {
        super(nome, cpf, dataDeNascimento);
    }

    @Override
    public double calcularMensalidade() {
        return calcularMensalidadeBase() * 0.8;
    }
}
