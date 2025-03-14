package javaIntermediario.sobrecargaDeConstrutores;

public class Uzumaki extends Ninja{

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki() {
    }
}
