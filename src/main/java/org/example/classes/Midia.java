package org.example.classes;

public abstract class Midia {

    private String titulo;
    private int duracaoEmMinutos;

    public Midia(String titulo, int duracaoEmMinutos){
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirDetalhes(){
        System.out.println(getTitulo());
        System.out.println(getDuracaoEmMinutos());
    }

    public abstract double calcularCusto();
}
