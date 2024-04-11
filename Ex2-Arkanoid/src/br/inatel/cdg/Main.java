package br.inatel.cdg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador();
        Scanner sc = new Scanner(System.in);
        Bloco[] blocos = new Bloco[50];
        int i = 0;
        int j = 0;
        int restante;

        boolean flag = true;
        while(flag){
            System.out.println("---------------------------");
            System.out.println("Menu");
            System.out.println("1- Adicionar bloco");
            System.out.println("2 - Destruir bloco");
            System.out.println("3 - Sair do jogo");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    blocos[i] = new Bloco();
                    i++;
                    System.out.println("Bloco adcionado");
                    break;

                case 2:
                    if(blocos[j]!=null) {
                        jogador.DestruiuBloco();
                        blocos[j].DestroiBloco();
                        j++;
                        System.out.println("Bloco destruido");
                    }
                    else
                        System.out.println("Não há mais blocos pra destruir");
                    break;

                case 3:
                    flag = false;
                    break;
            }
        }

        restante = Bloco.blocosCria - Bloco.blocosDes;

        System.out.println("Número de blocos criados: " + Bloco.blocosCria);
        System.out.println("Número de blocos destruidos: " + Bloco.blocosDes);
        System.out.println("Pontuação do jogador: " + jogador.getPonto());
        System.out.println("Número de moedas: " + Conversor.Converte(jogador));
        System.out.println("Restaram " + restante + " blocos");
    }
}

