import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Cantina cantina = new Cantina();

        Salgado salgadoNovo = new Salgado();

        for (int i = 0; i < 3; i++) {
            salgadoNovo.nome = entrada.nextLine();
            cantina.addSalgado(salgadoNovo);
        }

        cantina.mostraInfo();

        entrada.close();
    }
}