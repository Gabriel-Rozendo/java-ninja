package javaIntermediario.sobrecargaDeConstrutores;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uchiha, um ataque de fogo");
    }

    public void mostraQuantidadeDeMissoes() {
        System.out.println("Número de missões concluídas: " + numeroDeMissoesConcluidas + " missões");
    }

}
