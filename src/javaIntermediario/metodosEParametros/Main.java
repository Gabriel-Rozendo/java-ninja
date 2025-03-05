package javaIntermediario.metodosEParametros;

public class Main {
    public static void main(String[] args) {

        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";

        // APLICANDO METODO
        sasuke.sharinganAtivado();

        System.out.println(sasuke.euSouUmNinja());
        String msg = sasuke.euSouUmNinja();
        System.out.println(msg);

        int chamandoMetodo = sasuke.anosParaTornarHokage(70);
        System.out.println(chamandoMetodo);
        System.out.println(sasuke.anosParaTornarHokage(80));

    }
}
