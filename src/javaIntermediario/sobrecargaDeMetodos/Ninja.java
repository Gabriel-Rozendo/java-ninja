package javaIntermediario.sobrecargaDeMetodos;

public class Ninja implements EstrategiaDeBatalha{

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos
    //Sobrecarga de metodos você não precisa redeclar o construtor, só os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public Ninja() {
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque especial!");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + ". Essa é a minha ESTRATÉGIA de combate");
    }

    // Inteligencia de combate - Metodo padrao
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + ". Essa é minha INTELIGÊNCIA de combate");
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
}
