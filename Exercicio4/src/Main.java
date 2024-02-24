import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int nAlunos = entrada.nextInt();

        switch (nAlunos){
            case 10,20:
                System.out.println("A sala utilizada será a I-16");
                break;

            case 30:
                System.out.println("A sala utilizada será a I-22");
                break;

            default:
                System.out.println("Número de alunos inválido");
                break;
        }
    }
}