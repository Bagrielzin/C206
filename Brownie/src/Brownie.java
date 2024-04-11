public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Brownie adicionado ao carrinho");
    }

    public void calculaValorTotalCompra(){
        System.out.println("Nome do brownie: " + this.nome);
        System.out.println("Valor de compra: " + this.preco);
    }

    public void mostraInfo(){
        System.out.println("Nome do brownie: " + this.nome);
        System.out.println("Preco do brownie: " + this.preco);
        System.out.println("Sabor do brownie: " + this.sabor);
    }
}
