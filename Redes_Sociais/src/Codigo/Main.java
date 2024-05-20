package Codigo;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Facebook face = new Facebook("1234",200);
        Twitter twitter = new Twitter("1234",500);
        Instagram ig = new Instagram("1240",200); // teste da checked exception
        Set <RedeSocial> hashRedes = new HashSet<>();

        hashRedes.add(face);
        hashRedes.add(twitter);
        hashRedes.add(ig);
        hashRedes.add(null);

        Usuario user = new Usuario(hashRedes);
        user.setNome("Zézin");
        user.setEmail("zezin1234@gmail.com");

        user.mostraInfo();
    }
}