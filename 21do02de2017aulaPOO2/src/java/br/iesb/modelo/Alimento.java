package br.iesb.modelo;
public class Alimento {
    private String nome;
    private double kCal;
    private double lipideos;

    public Alimento() {
    }
    
    public Alimento(String nome, double kCal, double lipideos) {
        this.nome = nome;
        this.kCal = kCal;
        this.lipideos = lipideos;
    }

    public double getLipideos() {
        return lipideos;
    }

    public void setLipideos(double lipideos) {
        this.lipideos = lipideos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getkCal() {
        return kCal;
    }

    public void setkCal(double kCal) {
        this.kCal = kCal;
    }
}




