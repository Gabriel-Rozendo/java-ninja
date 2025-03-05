package javaIntermediario.metodosEParametros;

public class Ninja {

    String nome;
    int idade;
    String aldeia;

    //Criar um metodo público
    public void sharinganAtivado() {
        System.out.println("O sharingan ativou!");
    }

    public String euSouUmNinja() {
        return "Oi, eu sou um ninja!";
    }

    public int anosParaTornarHokage(int idadeMinimaParaSerHokage) {
        return (idadeMinimaParaSerHokage - this.idade);
    }
}
