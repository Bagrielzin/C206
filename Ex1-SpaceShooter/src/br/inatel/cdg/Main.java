package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        Nave nave1 = new Nave("OVNI",500,"Normal");
        Nave nave2 = new Nave("DuduX",1000,"Explosivo");
        Asteroide ast1 = new Asteroide("bolinha","Pequeno");
        Asteroide ast2 = new Asteroide("melao","Grande");

        System.out.println(nave1.getNome() + " atirando no " + ast1.getNome());
        nave1.atirar(ast1);

        System.out.println(nave1.getNome() + " atirando no " + ast2.getNome());
        nave1.atirar(ast2);

        System.out.println(nave2.getNome() + " atirando no " + ast1.getNome());
        nave2.atirar(ast1);

        System.out.println(nave2.getNome() + " atirando no " + ast2.getNome());
        nave2.atirar(ast2);

    }
}