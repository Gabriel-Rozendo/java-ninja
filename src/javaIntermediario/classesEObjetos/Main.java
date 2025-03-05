package javaIntermediario.classesEObjetos;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.aldeia = "Aldeia da Folha";

        System.out.println("O nome do ninja é " + naruto.nome);

        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 17;
        sasuke.aldeia = "Aldeia da Folha";

        System.out.println("O nome do ninja é " + sasuke.nome);
    }
}
