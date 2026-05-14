package org.example.classes;

import org.example.interfaces.Reproduzivel;

public class Musica extends Midia implements Reproduzivel {

    private String artista;

    public Musica(String titulo, int duracaoEmMinutos, String artista) {
        super(titulo, duracaoEmMinutos);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Artista: " + getArtista());
        System.out.printf("Preço: R$ %.2f%n", calcularCusto());
    }

    @Override
    public void darPlay() {
        System.out.println("Reproduzir musica " + getTitulo() + " do artista " + getArtista());
    }

    @Override
    public double calcularCusto() {
        return 2;
    }
}
