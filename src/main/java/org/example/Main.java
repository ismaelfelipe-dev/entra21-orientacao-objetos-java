package org.example;

import org.example.classes.ConversorTempo;
import org.example.classes.Filme;
import org.example.classes.Musica;
import org.example.interfaces.Reproduzivel;
import org.example.interfaces.Baixavel;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica(
                "White America",
                5,
                "Eminem"
        );

        Filme filme = new Filme(
                "O Hobbit: Uma Jornada Inesperada",
                169,
                "4K"
        );

        musica.exibirDetalhes();

        filme.exibirDetalhes();

        System.out.println(ConversorTempo.formatarMinutos(musica.getDuracaoEmMinutos()));
        System.out.println(ConversorTempo.formatarMinutos(filme.getDuracaoEmMinutos()));

        processarPlayer(musica);
        processarPlayer(filme);

        // download(musica);
        download(filme);
    }

    public static void processarPlayer (Reproduzivel item){
        item.darPlay();
    }

    public static void download (Baixavel item){
        item.realizarDownload();
    }
}

