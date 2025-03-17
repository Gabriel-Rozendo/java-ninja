package javaIntermediario.sobrecargaDeMetodos;

public class Uchiha extends Ninja {

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

    // Sobrecarga de metodo - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
        }
    }

    // Inteligencia de combate - Metodo padrao
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + ". Essa é minha INTELIGÊNCIA de combate");
    }

}
