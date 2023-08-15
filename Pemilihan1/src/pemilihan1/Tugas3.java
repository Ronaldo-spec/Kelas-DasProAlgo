package pemilihan1;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Menu, jumlah, total = 0, pajak, ppn,harga, kembalian, bayar;
        System.out.println("Menu: ");
        System.out.println("1. Es Oyen: Rp.10.000");
        System.out.println("2. Es Lilin: Rp.5.000");
        System.out.println("3. Es Susu: Rp.8.000");
        System.out.println("Masukkan pesanan anda: ");
        Menu = input.nextInt();
        System.out.println("Jumlah Pesanan; ");
        jumlah = input.nextInt();
        switch (Menu) {
            case 1:
                total = jumlah * 10000;
                System.out.println("Harga: " + total);
                break;
            case 2:
                total = jumlah * 5000;
                System.out.println("Total Bayar: " + total);
                break;
            case 3:
                total = (jumlah * 8000);
                System.out.println("Total Bayar: " + total);
                break;
        }
        ppn = total * 10 / 100;
        System.out.println("Jumlah pembayaran (termasuk ppn): " + ppn);
        harga = total + ppn;
        System.out.println("Total: Rp."+harga);
        System.out.println("Uang Pembayaran: ");
        bayar = input.nextInt();
        kembalian = bayar - harga;
        if (bayar>harga) {
            System.out.println("Kembalian anda: Rp."+kembalian);
            System.out.println("Kembaliannya Boleh Disumbangkan?");
        } else if (bayar<harga) {
            System.out.println("Uang Anda Kurang");
        } else {
            System.out.println("Uang Anda Pas");
            System.out.println("Terima Kasih :D");
        }
    }
}
