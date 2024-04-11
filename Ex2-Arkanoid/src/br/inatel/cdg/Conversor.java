package br.inatel.cdg;

public class Conversor {

    private static int moeda = 0;

    public static int Converte(Jogador jogador){
        moeda += jogador.getPonto()*100;
        return moeda;
    }
}
