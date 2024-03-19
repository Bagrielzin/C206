import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente c1 = new Cliente("Dudu",12145678);

        System.out.print("Digite a promoção desejada: ");
        int op = scanner.nextInt();

        while(op != 0) {
            System.out.print("1- memoria usb inclusa 2- sem memoria inclusa: ");
            int verusb = scanner.nextInt();
            switch (op) {
                case 1:
                    c1.pcs[0] = new Computador("Positivo", 3300.00F, "Pentium Core i3", 2200F, "Memória RAM", 8F, "HD", 500, "Linux", 32);
                    String nomeusb = "Pendrive";
                    int capac = 16;
                    MemoriaUSB usb = new MemoriaUSB(nomeusb, capac);
                    if (verusb == 1)
                        c1.pcs[0].addMemoriaUSB(usb);
                    c1.pcs[0].mostraPCConfigs();
                    break;

                case 2:
                    c1.pcs[1] = new Computador("Acer", 8800.00F, "Pentium Core i5", 3370F, "Memória RAM", 16F, "HD", 1000, "Windows 8", 64);
                    nomeusb = "Pendrive";
                    capac = 32;
                    usb = new MemoriaUSB(nomeusb, capac);
                    if (verusb == 1)
                        c1.pcs[1].addMemoriaUSB(usb);
                    c1.pcs[1].mostraPCConfigs();
                    break;

                case 3:
                    c1.pcs[2] = new Computador("Positivo", 4800.00F, "Pentium Core i7", 24500F, "Memória RAM", 32F, "HD", 2000, "Windows 10", 64);
                    nomeusb = "HD externo";
                    capac = 1000;
                    usb = new MemoriaUSB(nomeusb, capac);
                    if (verusb == 1)
                        c1.pcs[2].addMemoriaUSB(usb);
                    c1.pcs[2].mostraPCConfigs();
                    break;
            }
            System.out.print("Deseja selecionat uma nova opçaõ de computador: ");
            op = scanner.nextInt();
        }

        System.out.println("Nome do cliente: " + c1.nome);
        System.out.println("Cpf do cliente: " + c1.cpf);
        c1.calculaTotalCompra();
    }
}