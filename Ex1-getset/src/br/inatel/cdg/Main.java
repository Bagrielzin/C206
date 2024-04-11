package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();
        Cliente[] clientes = new Cliente[10];

        clientes[0] = new Cliente();
        clientes[0].setNome("ABc");
        clientes[0].setCpf(123456);
        conta.setClientes(clientes);

        System.out.println("Nome do cliente: " + clientes[0].getNome());
        System.out.println("cpf do cliente: " + clientes[0].getCpf());

        System.out.println("Numero da conta: " + conta.getNumero());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Limite da conta: " + conta.getLimite());

        conta.sacar(2000);
        System.out.println("Saldo da conta: " + conta.getSaldo());
        conta.deposita(500);
        System.out.println("Saldo da conta: " + conta.getSaldo());
    }
}