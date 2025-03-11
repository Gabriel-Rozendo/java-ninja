package javaIntermediario.desafio4;

public abstract class NinjaInfo {

    String nome;
    int idade;
    String habilidade;

    public NinjaInfo(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaInfo() {
    }
}
