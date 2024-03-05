public class Main {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        kart1.nome = "Corsa";
        kart2.nome = "Fusca";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        kart1.piloto.nome = "Mario";
        kart1.piloto.vilao = false;
        kart2.piloto.nome = "Bowser";
        kart2.piloto.vilao = true;

        kart1.motor.cilindradas = 50;
        kart1.motor.velocidadeMaxima = 80.5F;
        kart2.motor.cilindradas = 100;
        kart2.motor.velocidadeMaxima = 65.5F;

        System.out.println("Nome do Piloto: " + kart1.piloto.nome);
        if(kart1.piloto.vilao){
            System.out.println("Vilao");
        }
        else{
            System.out.println("Heroi");
        }
        System.out.println("Nome do Kart do Piloto: " + kart1.nome);
        kart1.motor.mostraInfo();
        System.out.println();

        System.out.println("Nome do Piloto: " + kart2.piloto.nome);
        if(kart2.piloto.vilao){
            System.out.println("Vilao");
        }
        else{
            System.out.println("Heroi");
        }
        System.out.println("Nome do Kart do Piloto: " + kart2.nome);
        kart2.motor.mostraInfo();
        System.out.println();

        kart1.pular();
        kart1.soltarTurbo();
        kart1.fazerDrift();
        kart1.piloto.soltaSuperPoder();

        System.out.println("Nome do Piloto: " + kart1.piloto.nome);
        if(kart1.piloto.vilao){
            System.out.println("Vilao");
        }
        else{
            System.out.println("Heroi");
        }
        System.out.println("Nome do Kart do Piloto: " + kart1.nome);
        kart1.motor.mostraInfo();

        System.out.println();

        System.out.println("Nome do Piloto: " + kart2.piloto.nome);
        if(kart2.piloto.vilao){
            System.out.println("Vilao");
        }
        else{
            System.out.println("Heroi");
        }
        System.out.println("Nome do Kart do Piloto: " + kart2.nome);
        kart2.motor.mostraInfo();

    }
}