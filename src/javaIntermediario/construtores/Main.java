package javaIntermediario.construtores;

public class Main {
    public static void main(String[] args) {

        Hokages tobirama = new Hokages("Tobirama Senju", 25, false);
        System.out.println(tobirama.nome);
        System.out.println(tobirama.idade);
        System.out.println(tobirama.isVivo);
    }
}
