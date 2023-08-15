package algoritma;

import java.util.Scanner;

public class paketChicken {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int paket, menu, banyak, jumlah, chickenA, chickenB, chickenC, okeA, okeB, okeC, jawab,total=0;
        boolean ulang = true;
        while (ulang) {
            System.out.println("Silahkan pilih paket");
            System.out.println("1. Paket Chicken");
            System.out.println("2. Paket Oke");
            paket = input.nextInt();
            switch (paket) {
                case 1:
                    System.out.println("Anda memilih Paket Chicken");
                    System.out.println("1. Chicken A (Rp 12.000)");
                    System.out.println("2. Chicken B (Rp 15.000)");
                    System.out.println("3. Chicken C (Rp 20.000)");
                    System.out.print("Silahkan pilih menu: ");
                    menu = input.nextInt();
                    if (menu == 1) {
                        System.out.println("Anda memilih menu Chicken A");
                        chickenA = 12000;
                        System.out.println("Banyak pesanan: ");
                        banyak = input.nextInt();
                        jumlah = chickenA * banyak;
                        System.out.println("Jumlah harga Chicken A adalah " + jumlah);
                        total+=jumlah;
                    } else if (menu == 2) {
                        System.out.println("Anda memilih menu Chicken B");
                        chickenB = 15000;
                        System.out.println("Banyak Pesanan: ");
                        banyak = input.nextInt();
                        jumlah = chickenB * banyak;
                        System.out.println("Jumlah harga Chicken B adalah " + jumlah);
                        total+=jumlah;

                    } else if (menu == 3) {
                        System.out.println("Anda memilih menu Chicken C");
                        chickenC = 20000;
                        System.out.println("Banyak pesanan: ");
                        banyak = input.nextInt();
                        jumlah = chickenC * banyak;
                        System.out.println("Jumlah harga Chicken C adalah " + jumlah);
                        total+=jumlah;
                    } else {
                        System.out.println("Maaf inputan anda salah");
                    }
                break;
                case 2:
                    System.out.println("Anda memilih Paket Oke");
                    System.out.println("1. Oke A (Rp 10.000)");
                    System.out.println("2. Oke B (Rp 12.000)");
                    System.out.println("3. Oke C (Rp 15.000)");
                    System.out.print("Silahkan pilih menu: ");
                    menu = input.nextInt();
                    if (menu == 1) {
                        System.out.println("Anda memilih menu Oke A");
                        okeA = 10000;
                        System.out.println("Banyak pesanan: ");
                        banyak = input.nextInt();
                        jumlah = okeA * banyak;
                        System.out.println("Jumlah harga oke A adalah " + jumlah);
                        total+=jumlah;
                    } else if (menu == 2) {
                        System.out.println("Anda memilih menu Oke B");
                        okeB = 12000;
                        System.out.println("Banyak Pesanan: ");
                        banyak = input.nextInt();
                        jumlah = okeB * banyak;
                        System.out.println("Jumlah harga oke B adalah " + jumlah);
                        total+=jumlah;
                    } else if (menu == 3) {
                        System.out.println("Anda memilih menu Oke C");
                        okeC = 15000;
                        System.out.println("Banyak Pesanan: ");
                        banyak = input.nextInt();
                        jumlah = okeC * banyak;
                        System.out.println("Jumlah harga Oke C adalah " + jumlah);
                        total+=jumlah;
                    } else {
                        System.out.println("Maaf inputan anda salah");
                    }
                break;
            }
            System.out.println("Apa anda ingin memesan lagi?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            jawab = input.nextInt();
            if (jawab == 2) {
                ulang = false;
                
                System.out.println("Total harga pesanan anda adalah Rp "+total);
            }
            
        }
    }
}