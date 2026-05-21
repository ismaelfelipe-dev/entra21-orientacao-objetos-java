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

    public int calcularIdade(){
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    public abstract double calcularMensalidade();

    protected double calcularMensalidadeBase() {

        int idade = calcularIdade();

        if (idade <= 18) {
            return 180;
        }

        if (idade <= 59) {
            return 340;
        }

        return 620;
    }

    public abstract boolean podeSolicitarInternacao();
}