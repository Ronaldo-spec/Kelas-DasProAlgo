package pemilihan2;

import java.util.Scanner;

public class tugas4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu1, menu2;
        double hasil, sisi, alas, tinggi, diameter, jari;
        System.out.println("Yang ingin dicari: ");
        System.out.println("1. Luas");
        System.out.println("2. Volume");
        System.out.println("Pilih jenis menu: ");
        menu1 = input.nextInt();
        switch (menu1) {
            case 1:
                System.out.println("Pilih jenis bentuk bangunan: ");
                System.out.println("1. Persegi");
                System.out.println("2. Segitiga");
                menu2 = input.nextInt();
                switch (menu2) {
                    case 1:
                        System.out.println("Masukkan panjang sisi persegi");
                        sisi = input.nextDouble();
                        hasil = sisi * 4;
                        System.out.println("Luas Persegi adalah: " + hasil);
                        break;
                    case 2:
                        System.out.println("Masukkan panjang alas Segitiga");
                        alas = input.nextDouble();
                        System.out.println("Masukkan ketinggian segitiga: ");
                        tinggi = input.nextDouble();
                        hasil = alas * tinggi * 1 / 2;
                        System.out.println("Luas Segitiga adalah: " + hasil);
                        break;
                    
                }
            case 2:
                System.out.println("Pilih jenis bentuk bangunan");
                System.out.println("1. Kubus");
                System.out.println("2. Tabung");
                menu2 = input.nextInt();
                switch (menu2) {
                    case 1:
                        System.out.println("Masukkan panjang sisi kubus: ");
                        sisi = input.nextDouble();
                        hasil = sisi*sisi*sisi;
                        System.out.println("Volume Kubusnya adalah: "+hasil);
                        break;
                    case 2:
                        System.out.println("Masukkan diameter alas tabung: ");
                        diameter = input.nextDouble();
                        System.out.println("Masukkan ketinggian tabung: ");
                        tinggi = input.nextDouble();
                        jari = diameter/2;
                        alas = 22/7*(jari*jari);
                        hasil = alas*tinggi;
                        System.out.println("Volume tabungnya adalah: "+hasil);
                        break;
                    default:
                        System.out.println("Anda salah input data");
                }
        }
    }
}
