package javaIntermediario.desafio3;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Recuperar o amuleto";
        sasuke.nivelDificuldade = "S";
        sasuke.statusMissao = "Em andamento";
        sasuke.habilidadeEspecial = "Amaterasu";

        sasuke.mostrarHabilidadeEspecial();
        sasuke.mostrarInformacoes();
    }
}
