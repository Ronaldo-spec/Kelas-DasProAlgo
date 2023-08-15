package Pemilihan2;

import java.util.Scanner;

public class Percobaan1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan Jumlah Nilai: ");
        nilai = input.nextInt();
        if (nilai <= 49 && nilai > 0) {
            System.out.println("Nilai anda adalah E");
        } else if (nilai >= 50 && nilai <= 59) {
            System.out.println("Nilai anda adalah D");
        } else if (nilai >= 60 && nilai <= 70) {
            System.out.println("Nilai anda adalah C");
        } else if (nilai >= 80 && nilai <= 89) {
            System.out.println("Nilai anda adalah B");
        } else if (nilai >= 90 && nilai <= 100) {
            System.out.println("Nilai anda adalah A");
        } else if (nilai > 100) {
            System.out.println("Nilai yang anda masukkan lebih dari 100");
        } else {
            System.out.println("Nilai yang anda masukkan kurang dari 0");
        }
    }
}
