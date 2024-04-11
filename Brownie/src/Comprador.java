public class Comprador {

    private String nome;
    private double saldo;
    private double total;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        if(saldo >= brownie.preco) {
            brownie.addCarrinhoDeCompras();
            brownie.calculaValorTotalCompra();
            total += brownie.preco;
        }
        else{
            System.out.println("Sem dinheiro");
        }
    }

    public double getTotal() {
        return total;
    }
}
