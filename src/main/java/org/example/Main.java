package org.example;

import org.example.classes.ConversorTempo;
import org.example.classes.Filme;
import org.example.classes.Musica;
import org.example.interfaces.IReproduzivel;
import org.example.interfaces.IBaixavel;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
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


        System.out.println(musica.getTitulo());
        System.out.println(musica.getArtista());
        System.out.println(musica.getDuracaoEmMinutos());
        System.out.println(musica.calcularCusto());

        System.out.println(filme.getTitulo());
        System.out.println(filme.getQualidade());
        System.out.println(filme.getDuracaoEmMinutos());
        System.out.println(filme.calcularCusto());

        System.out.println(ConversorTempo.formatarMinutos(musica.getDuracaoEmMinutos()));
        System.out.println(ConversorTempo.formatarMinutos(filme.getDuracaoEmMinutos()));

        processarPlayer(musica);
        processarPlayer(filme);

        // download(musica);
        download(filme);
    }

    public static void processarPlayer (IReproduzivel item){
        item.darPlay();
    }

    public static void download (IBaixavel item){
        item.realizarDownload();
    }
}

