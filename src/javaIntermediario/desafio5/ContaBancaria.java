package javaIntermediario.desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: R$ " + this.saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Não é possível fazer um depósito negativo");
        }
    }
}
