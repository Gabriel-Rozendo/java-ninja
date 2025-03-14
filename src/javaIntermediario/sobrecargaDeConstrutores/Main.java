package javaIntermediario.sobrecargaDeConstrutores;

public class Main {
    public static void main(String[] args) {

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;

        // Obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.mostraQuantidadeDeMissoes();
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalha();

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);

        // Obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.mostraQuantidadeDeMissoes();
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalha();
    }
}
