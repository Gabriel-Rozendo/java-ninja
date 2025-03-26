package javaIntermediario.refatorando;

public class Uchiha extends Ninja implements SharingaInterface{

    /**
     * Metodo:
     * Implementa da interface Sharingan
     */
    @Override
    public void sharinganAtivado() {
        System.out.println("Meu nome é: " + getNome() + ". O Sharingan Ativou");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + getNome() + " e esse é meu ataque Uchiha, um ataque de fogo");
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha() {
    }
}
