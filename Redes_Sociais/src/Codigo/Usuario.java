package Codigo;

import Exceptions.NumeroMinimoRedesException;
import Exceptions.RedeVaziaException;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    //Atributos do usuário
    private String nome;
    private String email;
    Set <RedeSocial> hashRedes = new HashSet<>();

    //Constructor do usuário
    public Usuario(Set<RedeSocial> hashRedes) {
        this.hashRedes = hashRedes;
    }

    //Setter dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Método que utiliza as redes
    public void utilizandoRedes(){
        int contador = 0; //Contador do número de redes

        for(RedeSocial rede : hashRedes){
            if(rede != null)
                contador++;
        }

        //Verificando se o númmero mínimo de redes foi adicionado
        try{
            if(contador < 2){
                throw new NumeroMinimoRedesException("Usuaro possui menos de 2 redes");
            }
        } catch (NumeroMinimoRedesException e) {
            e.printStackTrace();
        }

        //Executando os métodos das redes
        for(RedeSocial rede : hashRedes){
            //Verificando se foi adicionado algum valor nulo
            try {
                if(rede == null){
                    throw new RedeVaziaException("Valor nulo adicionado, sem dados");
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
            }
        }
    }
}
