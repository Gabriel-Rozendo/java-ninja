package javaIntermediario.sobrecargaDeConstrutores;

public class Ninja {

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    //Metodo existente: Primeiro metodo
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

    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é " + nome + ". Essa é a minha estratégia de combate");
    }
}
