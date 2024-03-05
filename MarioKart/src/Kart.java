public class Kart {

    String nome;
    Piloto piloto;
    Motor motor;

    void pular(){
        System.out.println("Personagem " + piloto.nome + " pulou");
        this.motor.velocidadeMaxima += 20F;
    }

    void soltarTurbo(){
        System.out.println("Personagem " + piloto.nome + " usou turbo");
        if(this.motor.cilindradas <= 150)
            this.motor.cilindradas = 150;
    }

    void fazerDrift(){
        System.out.println("Personagem " + piloto.nome + " fez o drift");
        this.motor.velocidadeMaxima += 10F;
    }

    public Kart(){
        motor = new Motor();
    }

}
