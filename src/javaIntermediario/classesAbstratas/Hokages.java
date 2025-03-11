package javaIntermediario.classesAbstratas;

public abstract class Hokages {

    String nome;
    int idade;
    boolean isVivo;

    public abstract void sabedoriHokage();

    public Hokages() {
        // Construtor vazio
    }

    public Hokages(String nome, int idade, boolean isVivo) {
        this.nome = nome;
        this.idade = idade;
        this.isVivo = isVivo;
    }
}
