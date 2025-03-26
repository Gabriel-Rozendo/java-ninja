package javaIntermediario.encapsulamento;

public class Main {
    public static void main(String[] args) {

        System.out.println("------- Naruto Uzumaki -------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 16, 20, 1.66);
        System.out.println("Nome: " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println("Nome: " + naruto.getNome());

        System.out.println("------- Sasuke Uchiha -------");
    }
}
