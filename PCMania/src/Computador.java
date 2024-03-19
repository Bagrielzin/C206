import javax.sound.midi.Soundbank;

public class Computador {

    String marca;
    float preco;
    HardwareBasico hardbasico;
    HardwareBasico hardbasico2;
    HardwareBasico hardbasico3;
    SistemaOperacional sistop;
    MemoriaUSB usbpc;
    boolean verusb = false;

    public Computador(String marca, float preco, String nomehard, float capachard, String nomehard2, float capachard2, String nomehard3, float capachard3, String nomesist, int tiposist) {
        this.marca = marca;
        this.preco = preco;
        this.hardbasico = new HardwareBasico(nomehard,capachard);
        this.hardbasico2 = new HardwareBasico(nomehard2,capachard2);
        this.hardbasico3 = new HardwareBasico(nomehard3,capachard3);
        this.sistop = new SistemaOperacional(nomesist,tiposist);
    }

    void addMemoriaUSB(MemoriaUSB usb){
        usbpc = usb;
        verusb = true;
    }

    void mostraPCConfigs(){
        System.out.println("Marca do PC: " + this.marca);
        System.out.println("Preco do PC: R$" + this.preco);
        System.out.println("Processador: " + this.hardbasico.nome + " " + this.hardbasico.capacidade + " Mhz");
        System.out.println(this.hardbasico2.nome + " " + this.hardbasico2.capacidade + " Gb");
        System.out.println("Capacidade do computador: " + this.hardbasico3.nome + " " + this.hardbasico3.capacidade + " Gb");
        System.out.println("Sistema operacional: " + this.sistop.nome + " " + this.sistop.tipo + " bits");
        if(verusb){
            System.out.println("Memória USB: " + usbpc.nome + " " + usbpc.capacidade + " Gb");
        }
    }

}
