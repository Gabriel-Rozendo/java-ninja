package javaIntermediario.classesAbstratas;

public class Main {
    public static void main(String[] args) {

        Senju tobirama = new Senju("Tobirama Senju", 25, false);
        System.out.println(tobirama.nome);
        System.out.println(tobirama.idade);
        System.out.println(tobirama.isVivo);

        tobirama.sabedoriHokage();
    }

}
