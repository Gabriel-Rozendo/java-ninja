package javaIntermediario.desafio4;

public class NinjaAvancado extends NinjaInfo implements Ninja{

    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + super.nome);
        System.out.println("Idade: " + super.idade);
        System.out.println("Habilidade: " + super.habilidade);
        System.out.println("Especialidade: " + this.especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu me chamo " + super.nome + ". E eu executei a minha habilidade: " + super.habilidade);
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {
    }
}
