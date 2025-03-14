package javaIntermediario.superClassesXSubClasses;

public abstract class Ninja implements NinjaInterface {

    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Eu taquei uma Kunai!");
    }

    @Override
    public void tacarShuriken() {
        System.out.println("Eu taquei uma shuriken");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é a minha estratégia de batalha");
    }

}
