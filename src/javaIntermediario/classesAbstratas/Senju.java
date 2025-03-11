package javaIntermediario.classesAbstratas;

public class Senju extends Hokages{

    @Override
    public void sabedoriHokage() {
        System.out.println("Você ganhou sabedoria");
    }

    public Senju() {
    }

    public Senju(String nome, int idade, boolean isVivo) {
        super(nome, idade, isVivo);
    }
}
