public class Cliente {

    String nome;
    long cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Computador pc;

    Computador[] pcs = new Computador[10];

    void calculaTotalCompra(){
        float precototal = 0f;
        for (int i = 0; i < pcs.length; i++) {
            if(pcs[i]!= null)
                precototal += pcs[i].preco;
        }

        System.out.println("Total gasto com os computadores: " + precototal);
    }


}

