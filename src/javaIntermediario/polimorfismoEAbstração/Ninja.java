package javaIntermediario.polimorfismoEAbstração;

public abstract class Ninja implements NinjaInterface {

    String nome;
    String aldeia;
    int idade;

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
