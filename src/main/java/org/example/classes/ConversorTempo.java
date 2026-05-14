package org.example.classes;

public class ConversorTempo {

    public static String formatarMinutos(int totalMinutos) {
        if (totalMinutos < 60) {
            return "Duração formatada: " + totalMinutos + "min";
        }
        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        if (minutos == 0) {
            return "Duração formatada: " + horas + "h";
        }

        return String.format("Duração formatada: %dh %02dmin", horas, minutos);
    }

}
