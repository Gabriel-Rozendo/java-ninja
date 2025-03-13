package javaIntermediario.classesAbstratasXInterfaces;

public class Uzumaki extends Ninja implements NinjaInterface{

    @Override
    public void nomeDoNinja() {
        System.out.println("O meu nome é " + this.nome);
    }

    @Override
    public void tacarShuriken() {
        System.out.println("Eu taquei uma shuriken");
    }
}
