package javaIntermediario.enums;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Resgatar o cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.A);
        missao2.exibirDetalhes();
    }
}
