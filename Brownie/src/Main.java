import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Comprador comprador = new Comprador("Dudu",60);
        Scanner sc = new Scanner(System.in);

        BrownieCafe bc = new BrownieCafe("Junin",15,"café");
        BrownieNutella bn = new BrownieNutella("Malenia",25,"nutella");
        BrownieDoceDeLeite bdl = new BrownieDoceDeLeite("Gepeto",20,"doce de leite");

        boolean flag = true;
        while(flag){
            System.out.println("--------------------");
            System.out.println("Menu");
            System.out.println("1 - Comprar brownie de " + bc.sabor);
            System.out.println("2 - Comprar brownie de " + bn.sabor);
            System.out.println("3 - Comprar brownie de " + bdl.sabor);
            System.out.println("4- Sair");
            int op = sc.nextInt();
            switch(op){
                case 1:
                    comprador.efetuarCompra(bc);
                    break;

                case 2:
                    comprador.efetuarCompra(bn);
                    break;

                case 3:
                    comprador.efetuarCompra(bdl);
                    break;

                case 4:
                    flag = false;
                    break;
            }
        }

        System.out.println("Total gasto: " + comprador.getTotal());
    }
}