package pemilihan1;

import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double silver, gold, platinum, total, diskon, harga;
        System.out.println("Masukkan total belanja anda:");
        total = input.nextDouble();
        if (total > 1000000) {
            platinum = 0.1;
            diskon = total * platinum;
            harga = total - diskon;
            System.out.println("Anda mendapatkan discount Platinum sebesar 10%");
            System.out.println("Total Belanja anda adalah: " + total);
            System.out.println("Jumlah discount: " + diskon);
            System.out.println("Total bayar anda adalah: " + harga);
        } else if (total > 500000) {
            gold = 0.05;
            diskon = total * gold;
            harga = total - diskon;
            System.out.println("Anda mendapatkan discount Gold sebesar 5%");
            System.out.println("Total Belanja anda adalah: " + total);
            System.out.println("Jumlah diskon: " + diskon);
            System.out.println("Total bayar anda adalah: " + harga);
        } else if (total > 200000) {
            silver = 0.05;
            diskon = total * silver;
            harga = total - diskon;
            System.out.println("Anda mendapatkan discount Silver sebesar 2%");
            System.out.println("Total Belanja anda adalah: " + total);
            System.out.println("Jumlah diskon: " + diskon);
            System.out.println("Total bayar anda adalah: " + harga);
        } else {
            System.out.println("Maaf anda belum dapat discount");
        }
    }
}
