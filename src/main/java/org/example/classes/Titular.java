package org.example.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Titular extends Beneficiario {

    private List<Dependente> dependentes = new ArrayList<>();

    public Titular(String nome, String cpf, LocalDate dataDeNascimento) {
        super(nome, cpf, dataDeNascimento);
    }

    @Override
    public double calcularMensalidade() {
        return 0;
    }
}
