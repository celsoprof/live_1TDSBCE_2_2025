package br.com.fiap.biblioteca.model;

// Essa classe é somente para explicação
public class Imc {

    private int peso;
    private double altura;
    private double imc;

    public void setPeso(int peso) {
        if (peso < 0 || peso > 600) {
            System.out.println("Peso invalido");
        } else {
            this.peso = peso;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        imc = peso / (altura * altura);
        return imc;
    }
}
