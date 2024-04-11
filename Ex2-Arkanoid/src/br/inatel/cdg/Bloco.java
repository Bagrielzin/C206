package br.inatel.cdg;

public class Bloco {

    static int blocosCria = 0;
    static int blocosDes = 0;

    public Bloco() {
        blocosCria++;
    }

    public void DestroiBloco(){
        blocosDes++;
    }

}
