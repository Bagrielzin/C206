import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        double quantia;

        z1.nome = "Dudu";
        z1.vida = 300.0;
        z2.nome = "Schuller";
        z2.vida = 200;

        System.out.print("Quantia de vida a ser transferida: ");
        quantia = entrada.nextDouble();

        if(z1.transfereVida(z1, quantia, z2)){
            System.out.println("Transferência de vida feita com sucesso!!");
        }

        else{
            System.out.println("Não foi possível transerir vida.");
        }

        System.out.println("Vida do zumbi " + z1.nome + " : " + z1.mostraVida());
        System.out.println("Vida do zumbi " + z2.nome + " : " + z2.mostraVida());

        entrada.close();
    }
}