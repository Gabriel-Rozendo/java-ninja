package javaIntermediario.herancaMultipla;

public class Uchiha extends Ninja implements SharinganIterface{

    // Esse metodo vem direto da Interface(SharinganInterface)
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }
}
