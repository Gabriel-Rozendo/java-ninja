package javaIntermediario.encapsulamento;

public class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int NumeroMissoesConcluidas;
    private double altura;

    public Ninja(String nome, String aldeia, int idade, int numeroMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        NumeroMissoesConcluidas = numeroMissoesConcluidas;
        this.altura = altura;
    }

    public Ninja() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroMissoesConcluidas() {
        return NumeroMissoesConcluidas;
    }

    public void setNumeroMissoesConcluidas(int numeroMissoesConcluidas) {
        NumeroMissoesConcluidas = numeroMissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
