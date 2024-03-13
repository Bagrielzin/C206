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

        matriz[x][y] = 1; // Local onde está a bomba

        int p1,p2;
        int explodiu = 0;
        int i;

        System.out.println(x + " " + y);

        do {
            for(i=0; i<3; i++) {
                System.out.println("Escolha a posição: ");
                p1 = entrada.nextInt();
                p2 = entrada.nextInt();
                if (matriz[p1][p2] == 1) {
                    System.out.println("Pisou na bomba, volte para o começo");
                    i = -1;
                }
            }
            explodiu = 1;
        }while(explodiu == 0);

        System.out.println("Parabéns você venceu!!");

        entrada.close();
    }
}