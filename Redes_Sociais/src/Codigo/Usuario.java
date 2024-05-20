package Codigo;

import Exceptions.NullException;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String nome;
    private String email;
    private RedeSocial[] redeSociais;
    Set <RedeSocial> hashRedes = new HashSet<>();

    public Usuario(RedeSocial[] redeSociais) {
        this.redeSociais = redeSociais;
        for (int i = 0; i < redeSociais.length; i++) {
            hashRedes.add(redeSociais[i]);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostraInfo(){
        System.out.println("Nome do usuário: " + this.nome);
        System.out.println("Email do usuário: " + this.email);
        for(RedeSocial rede : hashRedes){
            try {
                if(rede == null){
                    throw new NullException("Valor nulo adicionado, sem dados");
                }
                if (rede instanceof Facebook) {
                    Facebook fx = (Facebook) rede;
                    fx.postarFoto();
                    fx.postarComentario();
                    fx.fazStreaming();
                }

                if (rede instanceof Twitter) {
                    Twitter tx = (Twitter) rede;
                    tx.postarVideo();
                    tx.curtirPublicacao();
                    tx.compartilhar();
                }
            }catch (NullException e){
                System.out.println(e);
            }
        }
    }
}
