public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adcionaNutella(){
        System.out.println("Adcionado nutella");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de nuella adicionado");
    }
}
