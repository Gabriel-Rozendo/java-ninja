package javaIntermediario.finalClass;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------- Naruto Uzumaki -----------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16);
        System.out.println(naruto);
        naruto.tacarKunai();
        System.out.println(naruto.getAltura());

        System.out.println("----------- Sasuke Uchiha -----------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        System.out.println(sasuke);

        System.out.println("----------- Ninja Anbu -----------");
        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.setNome("Ninja Aleatório");

        System.out.println("Nome ninja anbu: " + ninjaAnbu.getNome());
    }
}
