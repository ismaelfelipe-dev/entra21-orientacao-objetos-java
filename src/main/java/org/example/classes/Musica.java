package org.example.classes;

import org.example.interfaces.IReproduzivel;

public class Musica extends Midia implements IReproduzivel {

    private String artista;

    public Musica(String titulo, int duracaoEmMinutos, String artista) {
        super(titulo, duracaoEmMinutos);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void darPlay() {
        System.out.println("Dar Play");
    }

    @Override
    public double calcularCusto() {
        return 2;
    }
}
