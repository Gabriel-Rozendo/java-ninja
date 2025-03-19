package javaIntermediario.desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente primeiraConta = new ContaCorrente();
        primeiraConta.consultarSaldo();
        primeiraConta.depositar(100);
        primeiraConta.consultarSaldo();

        System.out.println("");

        ContaPoupanca segundaConta = new ContaPoupanca();
        segundaConta.consultarSaldo();
        segundaConta.depositar(100);
        segundaConta.consultarSaldo();
    }
}
