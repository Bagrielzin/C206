package br.inatel.cdg;

public class Conta {

    private int numero = 4566;
    private float saldo = 9000;
    private float limite = 5000;
    private Cliente[] clientes = new Cliente[10];

    public void sacar(float quantia){
        if(this.saldo >= quantia && quantia <= this.limite){
            System.out.println("Saque feito com sucesso");
            this.saldo -= quantia;
        }
        else
            System.out.println("Não foi possível realizar o saque");
    }

    public void deposita(float quantia){
        System.out.println("Deposito feito com sucesso");
        this.saldo += quantia;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
}
