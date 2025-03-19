package javaIntermediario.desafio5;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = valor - (valor / 100);
            System.out.println("Taxa de depósito: 1%");
        } else {
            System.out.println("Não é possível fazer um depósito negativo");
        }
    }
}
