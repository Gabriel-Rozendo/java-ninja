package javaIntermediario.desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", 18, "Rasengan");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvancado sasuke = new NinjaAvancado("Sasuke Uchiha", 18, "Chidori", "Fogo");
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();
    }
}
