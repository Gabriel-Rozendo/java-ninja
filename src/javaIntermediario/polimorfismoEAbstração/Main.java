package javaIntermediario.polimorfismoEAbstração;

public class Main {
    public static void main(String[] args) {

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.nomeDoNinja();
        naruto.tacarKunai();
        naruto.tacarShuriken();
        naruto.estrategiaDeBatalhaNinja();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.nomeDoNinja();
        sasuke.tacarKunai();
        sasuke.estrategiaDeBatalhaNinja();
    }
}
