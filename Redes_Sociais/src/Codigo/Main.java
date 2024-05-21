package Codigo;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Criando 2 instancias de redes
        Facebook face = new Facebook("1234",200);
        Twitter twitter = new Twitter("1234",500);
        //Criando o hashSet para armazenar as redes
        Set <RedeSocial> hashRedes = new HashSet<>();

        //Adicionando as redes no hashSet
        hashRedes.add(face);
        hashRedes.add(twitter);

        //Criando o usuário e inserindo as redes nele
        Usuario user = new Usuario(hashRedes);
        //Setando as características do usuário
        user.setNome("Zézin");
        user.setEmail("zezin1234@gmail.com");

        //Usuárion utilizando as funções das redes
        user.utilizandoRedes();
    }
}