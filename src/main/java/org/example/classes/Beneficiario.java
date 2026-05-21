package org.example.classes;

import java.time.LocalDate;
import java.time.Period;

public abstract class Beneficiario  {
    private String nome;
    private String cpf;
    private LocalDate dataDeNascimento;

    public Beneficiario(String nome, String cpf, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public int idade(){
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    public abstract double calcularMensalidade();
}