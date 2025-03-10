package javaIntermediario.construtores;

public class Hokages {

    String nome;
    int idade;
    boolean isVivo;

    public Hokages() {
        // Construtor vazio
    }

    public Hokages(String nome, int idade, boolean isVivo) {
        this.nome = nome;
        this.idade = idade;
        this.isVivo = isVivo;
    }
}
