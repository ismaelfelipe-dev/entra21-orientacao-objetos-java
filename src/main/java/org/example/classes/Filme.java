package org.example.classes;

import org.example.interfaces.Baixavel;
import org.example.interfaces.Reproduzivel;

public class Filme extends Midia implements Reproduzivel, Baixavel {

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
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Qualidade de imagem: " + getQualidade());
        System.out.printf("Preço: R$ %.2f%n", calcularCusto());
    }

    @Override
    public void realizarDownload() {
        System.out.println("Fazendo Download do filme " + getTitulo());
    }

    @Override
    public void darPlay() {
        System.out.println("Reproduzir filme " + getTitulo() + " em " + getQualidade());
    }

    @Override
    public double calcularCusto() {
        if(qualidade.equalsIgnoreCase("4K")){
            return 15;
        } else {
            return 10;
        }
    }
}
