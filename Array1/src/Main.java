import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Banda banda = new Banda();
        Empresario empresario = new Empresario();
        Membro membroNovo = new Membro();
        Musica musicaNova = new Musica();
        int i;

        banda.nome = "ACDC";
        banda.genero = "Rock";
        empresario.nome = "Jorge";
        empresario.cnpj = 111222333;

        for(i=0; i<3; i++){
            System.out.print("Nome do membro novo: ");
            membroNovo.nome = entrada.nextLine();
            System.out.print("Funcao do membro novo: ");
            membroNovo.funcao = entrada.nextLine();
            banda.addMembroNovo(membroNovo);
        }

        for(i=0; i<3; i++){
            System.out.print("Nome da musica nova: ");
            musicaNova.nome = entrada.nextLine();
            System.out.print("Duracao da nova musica: ");
            musicaNova.duracao = entrada.nextDouble();
            banda.addMusicaNova(musicaNova);
            entrada.nextLine();
        }

        banda.mostraInfo();
        entrada.close();
    }
}