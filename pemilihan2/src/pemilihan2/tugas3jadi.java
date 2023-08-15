package pemilihan2;

import java.util.Scanner;

public class tugas3jadi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu;
        int harga, jenis, total, ongkir;
        System.out.println("Macam Menu :");
        System.out.println("Sate Kelici");
        System.out.println("Ayam Rebus");
        System.out.println("Bakso Gule");
        System.out.println("Pilih Menu: ");
        menu = input.nextLine();
        System.out.println("Harga: ");
        harga = input.nextInt();
        System.out.println("Dengan pengiriman expres? 0 = Tidak, 1 = Setuju");
        jenis = input.nextInt();
        if (jenis == 1) {
            if (harga>= 50000) {
                ongkir = 45000;
                
            } else {
                ongkir = 55000;
            }
            
        } else {
            if (harga>=50000) {
                ongkir = 20000;
                
            } else {
                ongkir = 30000;
            }
        }
            total = harga + ongkir;
            System.out.println("STRUK");
            System.out.println(menu+"\t\t: Rp."+ harga);
            System.out.println("Ongkos Kirim\t: Rp." +ongkir);
            System.out.println("Total Pembayaran: Rp." +total);
        }
    }

