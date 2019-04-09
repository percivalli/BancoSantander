package br.com.digitalhouse;

public abstract class Conta {
    private double saldo;
    private Cliente cliente;

    //Construtores

    public Conta(double saldo, Cliente cliente) {
        saldo = saldo;
        cliente = cliente;
    }

    public void depositarDinheiro(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void sacarDinheiro(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
        } else {
            System.out.println("Saldo não disponível. ");
        }

    }
}
