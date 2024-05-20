package Codigo;

import Exceptions.RedeVaziaException;
import Exceptions.TipoClasseException;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String nome;
    private String email;
    Set <RedeSocial> hashRedes = new HashSet<>();

    public Usuario(Set<RedeSocial> hashRedes) {
        this.hashRedes = hashRedes;
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
                    throw new RedeVaziaException("Valor nulo adicionado, sem dados");
                }

                if(rede instanceof Instagram){
                    throw new TipoClasseException("Tentando executar função não disponível nessa rede");
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
            }catch (RedeVaziaException e){
                System.out.println(e);
            } catch (TipoClasseException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
