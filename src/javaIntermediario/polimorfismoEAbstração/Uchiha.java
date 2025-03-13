package javaIntermediario.polimorfismoEAbstração;

public class Uchiha extends Ninja {

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void nomeDoNinja() {
        System.out.println("O meu nome é " + this.nome);
    }


}
