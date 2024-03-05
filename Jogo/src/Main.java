public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();

        personagem.nome = "Schuller";
        personagem.vida  = 69;
        Arma arma = new Arma();
        arma.nome = "Isqueiro";
        arma.poder = 24;
        arma.resistencia = 40;
        arma.descricao = "Taca fogo";

        personagem.arma = arma;

        System.out.println("Nome do personagem: " + personagem.nome);
        System.out.println("Vida do personagem: " + personagem.vida);
        personagem.arma.mostraInfoArma();

        personagem.usarArma();
        personagem.tomarDano();

        System.out.println("Nome do personagem: " + personagem.nome);
        System.out.println("Vida do personagem: " + personagem.vida);
        personagem.arma.mostraInfoArma();
    }
}