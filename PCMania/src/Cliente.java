public class Cliente {

    String nome;
    long cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    Computador pc;

    void calculaTotalCompra(){
        System.out.println("Preco da computador: " + pc.preco);
    }

}

