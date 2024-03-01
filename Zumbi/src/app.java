public class app {

    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        zumbi.forca = 100;
        zumbi.vida = 200;
        zumbi.altura = 1.5F;
        zumbi.nome = "Chris";

        zumbi.andar();
        zumbi.seAlimentar();
        zumbi.iniciar();

        System.out.println("O nome do zumbi é: " + zumbi.nome);
        System.out.println("A altura do zumbi é: " + zumbi.altura);
    }

}
