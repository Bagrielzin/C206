public class Cliente {

    //Variaveis do cliente
    String nome;
    long cpf;

    //Consrtuctor do cliente
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Array de computadores
    Computador[] pcs = new Computador[10];

    float calculaTotalCompra(){
        float precototal = 0f;
        for (int i = 0; i < pcs.length; i++) {
            if(pcs[i]!= null)
                precototal += pcs[i].preco;
        }

        return precototal;
    }


}

