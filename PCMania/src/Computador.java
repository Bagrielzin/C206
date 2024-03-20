import javax.sound.midi.Soundbank;

public class Computador {

    //Variaveis do computador
    String marca;
    float preco;
    //Ponteiros dos objetos
    SistemaOperacional sistop;
    HardwareBasico[] hardbasicos;
    MemoriaUSB usbpc;
    //Auxiliar de verificacao da memoria
    boolean verusb = false;

    //Constructor do computador
    public Computador(String marca, float preco, String nomesist, int tiposist) {
        this.marca = marca;
        this.preco = preco;
        this.hardbasicos = new HardwareBasico[3];
        this.sistop = new SistemaOperacional(nomesist,tiposist);
    }

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }

    void addMemoriaUSB(MemoriaUSB usb){
        usbpc = usb;
        verusb = true;
    }

    void mostraPCConfigs(){
        System.out.println("Marca do PC: " + this.marca);
        System.out.println("Preco do PC: R$" + this.preco);
        for (int i = 0; i < hardbasicos.length; i++) {
            if(hardbasicos[i]!=null)
                System.out.println("Hardware: " + hardbasicos[i].nome + " Capacidade: " + hardbasicos[i].capacidade);
        }
        System.out.println("Sistema operacional: " + this.sistop.nome + " " + this.sistop.tipo + " bits");
        if(verusb){
            System.out.println("Memória USB: " + usbpc.nome + " " + usbpc.capacidade + " Gb");
        }
    }

}
