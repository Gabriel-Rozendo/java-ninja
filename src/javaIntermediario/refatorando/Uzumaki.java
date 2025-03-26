package javaIntermediario.refatorando;

public class Uzumaki extends Ninja{

    private Biju biju;

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + getNome() + " e esse é meu ataque Uzumaki, um ataque de ar");
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki() {
    }

    public Biju getBijus() {
        return biju;
    }

    public void setBijus(Biju biju) {
        this.biju = biju;
    }
}
