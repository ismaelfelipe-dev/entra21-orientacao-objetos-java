package org.example.classes;

import org.example.interfaces.IBaixavel;
import org.example.interfaces.IReproduzivel;

public class Filme extends Midia implements IReproduzivel, IBaixavel {

    private String qualidade;

    public Filme(String titulo, int duracaoEmMinutos, String qualidade) {
        super(titulo, duracaoEmMinutos);
        this.qualidade = qualidade;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    @Override
    public double calcularCusto() {
        if(qualidade.equalsIgnoreCase("4K")){
            return 15;
        } else {
            return 10;
        }
    }

    @Override
    public void realizarDownload() {
        System.out.println("Fazendo Download do filme " + getTitulo());
    }

    @Override
    public void darPlay() {
        System.out.println("Reproduzir filme " + getTitulo() + " em " + getQualidade());
    }
}
