package javaIntermediario.enums;

public enum RankDeMissoes {

    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Difícil", 5),
    S("Altíssimo", 12);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
