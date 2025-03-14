package javaIntermediario.herancaMultipla;

public class Hatake extends Ninja implements SharinganIterface, AnbuInterface, HokageInteface{

    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }

    // Esse metodo vem direto da Interface(SharinganInterface)
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um ninja de elite da ANBU");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + ": Eu sou um HOKAGE");
    }
}
