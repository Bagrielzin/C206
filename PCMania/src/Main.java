import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente c1 = new Cliente("Dudu",12145678);

        System.out.print("Digite a promoção desejada: ");
        int op = scanner.nextInt();

        int i = 0;

        while(op != 0) {
            System.out.print("1- memoria usb inclusa 2- sem memoria inclusa: ");
            int verusb = scanner.nextInt();
            switch (op) {
                case 1:
                    c1.pcs[i] = new Computador("Positivo", 3300.00F, "Linux", 32);
                    c1.pcs[i].hardbasicos[0] = new HardwareBasico("Pentium Core i3",2200F);
                    c1.pcs[i].hardbasicos[1] = new HardwareBasico("Memoria RAM",8F);
                    c1.pcs[i].hardbasicos[2] = new HardwareBasico("HD",500);
                    String nomeusb = "Pendrive";
                    int capac = 16;
                    MemoriaUSB usb = new MemoriaUSB(nomeusb, capac);
                    if (verusb == 1)
                        c1.pcs[i].addMemoriaUSB(usb);
                    c1.pcs[i].mostraPCConfigs();
                    break;

                case 2:
                    c1.pcs[i] = new Computador("Acer", 8800.00F, "Windows 8", 64);
                    c1.pcs[i].hardbasicos[0] = new HardwareBasico("Pentium Core i5",3370F);
                    c1.pcs[i].hardbasicos[1] = new HardwareBasico("Memoria RAM",16F);
                    c1.pcs[i].hardbasicos[2] = new HardwareBasico("HD",1000);
                    nomeusb = "Pendrive";
                    capac = 32;
                    usb = new MemoriaUSB(nomeusb, capac);
                    if (verusb == 1)
                        c1.pcs[i].addMemoriaUSB(usb);
                    c1.pcs[i].mostraPCConfigs();
                    break;

                case 3:
                    c1.pcs[i] = new Computador("Positivo", 4800.00F,"Windows 10", 64);
                    c1.pcs[i].hardbasicos[0] = new HardwareBasico("Pentium Core i7",4500F);
                    c1.pcs[i].hardbasicos[1] = new HardwareBasico("Memoria RAM",32);
                    c1.pcs[i].hardbasicos[2] = new HardwareBasico("HD",2000);
                    nomeusb = "HD externo";
                    capac = 1000;
                    usb = new MemoriaUSB(nomeusb, capac);
                    if (verusb == 1)
                        c1.pcs[i].addMemoriaUSB(usb);
                    c1.pcs[i].mostraPCConfigs();
                    break;
            }
            System.out.print("Deseja selecionar uma nova opçaõ de computador: ");
            op = scanner.nextInt();
            i++;
        }

        System.out.println("Nome do cliente: " + c1.nome);
        System.out.println("Cpf do cliente: " + c1.cpf);
        System.out.println("Total gasto com os computadores: R$" + c1.calculaTotalCompra());
    }
}