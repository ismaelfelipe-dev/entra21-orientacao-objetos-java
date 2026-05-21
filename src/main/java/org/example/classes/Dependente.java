package org.example.classes;

import java.time.LocalDate;

public class Dependente extends Beneficiario {

    public Dependente(String nome, String cpf, LocalDate dataDeNascimento) {
        super(nome, cpf, dataDeNascimento);
    }

    @Override
    public double calcularMensalidade() {
        return calcularMensalidadeBase() * 0.7;
    }

    @Override
    public boolean podeSolicitarInternacao() {
        return false;
    }
}
