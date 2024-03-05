public class Arma {

    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArma(){
        System.out.println("Poder: " + this.poder);
        System.out.println("Nome: " + this.nome);
        System.out.println("Resistencia: " + this.resistencia);
        System.out.println("Descricao: " + this.descricao);
    }


}
