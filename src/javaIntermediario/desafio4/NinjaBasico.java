package javaIntermediario.desafio4;

public class NinjaBasico extends NinjaInfo implements Ninja{

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + super.nome);
        System.out.println("Idade: " + super.idade);
        System.out.println("Habilidade: " + super.habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu me chamo " + super.nome + ". E eu executei a minha habilidade: " + super.habilidade);
    }

    public NinjaBasico(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public NinjaBasico() {
    }
}
