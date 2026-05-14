package org.example.classes;
import org.example.classes.Filme;

public class ConversorTempo {

    private int totalMinutos;

    public ConversorTempo(int totalMinutos) {
        this.totalMinutos = totalMinutos;
    }

    public int getMinutos() {
        return totalMinutos;
    }

    public void setMinutos(int totalMinutos) {
        this.totalMinutos = totalMinutos;
    }

    public static String formatarMinutos(int totalMinutos) {
        if (totalMinutos < 60) {
            return totalMinutos + "min";
        }
        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        if (minutos == 0) {
            return horas + "h";
        }

        return String.format("%dh %02dmin", horas, minutos);
    }

}
