package javaIntermediario.classesAbstratasXInterfaces;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.nomeDoNinja();
        naruto.tacarKunai();
        naruto.tacarShuriken();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.nomeDoNinja();
        sasuke.tacarKunai();
    }
}
