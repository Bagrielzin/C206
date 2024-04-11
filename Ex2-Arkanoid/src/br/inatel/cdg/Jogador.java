package br.inatel.cdg;

public class Jogador {

    private int ponto = 0;

    public void DestruiuBloco(){
        ponto++;
    }

    public int getPonto() {
        return ponto;
    }
}
