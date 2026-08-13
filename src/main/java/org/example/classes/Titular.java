package org.example.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Titular extends Beneficiario {

    private List<Dependente> dependentes = new ArrayList<>();

    public Titular(String nome, String cpf, LocalDate dataDeNascimento) {
        super(nome, cpf, dataDeNascimento);
    }

    public List<Dependente> getDependentes() {
        return List.copyOf(dependentes);
    }

    @Override
    public double calcularMensalidade() {
        return calcularMensalidadeBase();
    }

    public void adicionarDependente(Dependente dependente) {
        if (dependentes.size() >= 3) {
            throw new IllegalArgumentException(
                    "Máximo de 3 dependentes");
        }
        if (dependente.calcularIdade() > 24) {
            throw new IllegalArgumentException("Dependente maior de 24 anos");
        }
        dependentes.add(dependente);
    }

    public double calcularTotalGrupo() {

        double total = calcularMensalidade();

        for (Dependente dependente : dependentes) {
            total += dependente.calcularMensalidade();
        }

        return total;
    }

    @Override
    public boolean podeSolicitarInternacao() {
        return true;
    }

    @Override
    public String toString() {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String resultado =
                "****** RESUMO DO CONTRATO ******\n\n" +
                        "Titular: " + getNome() + "\n" +
                        "CPF: " + getCpf() + "\n" +
                        "Data de nascimento: " +
                        getDataDeNascimento().format(formato) + "\n\n" +
                        "Dependentes:\n\n";

        for (Dependente dependente : dependentes) {

            resultado +=
                    "Nome: " + dependente.getNome() +
                            "\nCPF: " + dependente.getCpf() +
                            "\nData de nascimento: " +
                            dependente.getDataDeNascimento().format(formato) +
                            "\n\n";
        }

        resultado +=
                "Total mensal do grupo: R$ " + calcularTotalGrupo() + "\n";

        return resultado;
    }
}
