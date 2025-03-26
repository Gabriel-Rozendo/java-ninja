package javaIntermediario.refatorando;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 20, RankNinja.GENIN, Biju.KURAMA);
        naruto.habilidadeEspecial();
        System.out.println(naruto.getBijus());

        System.out.println("---------------------------------------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, RankNinja.GENIN);
        sasuke.habilidadeEspecial();
        System.out.println("---------------------------------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27, 60, RankNinja.JOUNIN);
        itachi.habilidadeEspecial();
        System.out.println("---------------------------------------");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, RankNinja.KAGE);
        madara.habilidadeEspecial();
        System.out.println("---------------------------------------");


    }
}
