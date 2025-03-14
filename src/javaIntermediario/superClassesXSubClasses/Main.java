package javaIntermediario.superClassesXSubClasses;

public class Main {
    public static void main(String[] args) {

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;
        naruto.nomeDoNinja();
        naruto.tacarKunai();
        naruto.tacarShuriken();
        naruto.estrategiaDeBatalhaNinja();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;
        sasuke.nomeDoNinja();
        sasuke.tacarKunai();
        sasuke.estrategiaDeBatalhaNinja();

        // Obj Uchiha2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.nomeDoNinja();
        itachi.tacarKunai();
        itachi.tacarShuriken();
    }
}
