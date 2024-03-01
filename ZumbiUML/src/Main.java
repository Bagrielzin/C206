public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Dudu";
        z1.vida = 200.0;
        z2.nome = "Schuller";
        z2.vida = 50;

        if(z1.transfereVida(z1, z2.vida, z2)){
            System.out.println("Transferência de vida feita com sucesso!!");
        }

        else{
            System.out.println("Não foi possível transerir vida pois o outro zumbi já estava morto.");
        }

        System.out.println("Vida do zumbi " + z1.nome + " : " + z1.mostraVida());
        System.out.println("Vida do zumbi " + z2.nome + " : " + z2.mostraVida());

    }
}