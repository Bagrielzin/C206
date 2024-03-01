public class Zumbi {

    double vida;
    String nome;


    double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia, Zumbi zumbiComido){
        if(quantia > 0) {
            zumbiAlvo.vida += quantia;
            zumbiComido.vida -= quantia;
            return true;
        }

        else{
            return false;
        }

    }


}
