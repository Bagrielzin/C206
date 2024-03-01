public class Zumbi {

    int vida;
    String nome;
    float altura;
    int forca;

    void iniciar(){
        vida = 100;
        nome = "Schuller";
        altura = 1.68F;
        forca = 999;
    }

    void andar(){
        System.out.println("Zumbi andando...");
    }

    void seAlimentar(){
        System.out.println("Zumbi se alimentando");
    }

}
