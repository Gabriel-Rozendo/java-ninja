package javaIntermediario.superClassesXSubClasses;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void nomeDoNinja() {
        System.out.println("O meu nome é " + this.nome);
    }


}
