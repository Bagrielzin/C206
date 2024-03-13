import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] matriz;
        matriz = new int[2][2];
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);

        int p1,p2;
        int explodiu = 0;
        int i;

        System.out.println(x + " " + y);
        do {
            for(i=0; i<3; i++) {
                System.out.println("Escolha a posição: ");
                p1 = entrada.nextInt();
                p2 = entrada.nextInt();
                if (p1 == x && p2 == y) {
                    System.out.println("Pisou na bomba, volte para o começo");
                    explodiu = 0;
                    i = -1;
                }
            }
            explodiu = 1;
        }while(explodiu == 0);

        System.out.println("Parabéns você venceu!!");

    }
}