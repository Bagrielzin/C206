public class Personagem {

    String nome;
    int vida;
    Arma arma;

    void usarArma(){
        System.out.println("Arma utilizada");
        arma.resistencia -= 2;
    }

    void tomarDano(){
        System.out.println("Personagem danificado");
        this.vida -= 5;
    }

}
