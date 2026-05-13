package org.example;

import org.example.classes.Musica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Musica musica = new Musica(
                "White America",
                5,
                "Eminem"
        );

        System.out.println("Musica: " + musica.getTitulo());
        System.out.println("Duração: " + musica.getDuracaoEmMinutos() + " minutos");
        System.out.println("Artista " + musica.getArtista());
        System.out.println("Custo: " + musica.calcularCusto());

    }
}
