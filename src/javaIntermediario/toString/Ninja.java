package javaIntermediario.toString;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja() {
    }

    @Override
    public String toString() {
        return "Meu nome é: " + getNome() + " eu sou da: " + getAldeia() + " e tenho: " + getIdade() + " anos";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
