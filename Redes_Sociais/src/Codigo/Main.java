package Codigo;

import Exceptions.NullException;
import Exceptions.TipoClasseException;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Facebook face = new Facebook("1234",200);
        Twitter twitter = new Twitter("1234",500);
        RedeSocial[] redeSociais = new RedeSocial[5];

        redeSociais[0] = face;
        redeSociais[1] = twitter;
        redeSociais[2] = null;

        Usuario user = new Usuario(redeSociais);
        user.setNome("Zézin");
        user.setEmail("zezin1234@gmail.com");

        user.mostraInfo();
    }
}