package arraymultidimensi;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, b, c, x, y, baris, kolom;
        System.out.println("Masukkan Matriks A");
        System.out.println("Jumlah baris: ");
        baris = input.nextInt();
        System.out.println("Jumlah kolom: ");
        kolom = input.nextInt();
        int[][] a = new int[baris][kolom];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("Masukkan nilai ke-" + i + " ");
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan Matriks B");
        System.out.println("Jumlah baris: ");
        x = input.nextInt();
        System.out.println("Jumlah kolom: ");
        y = input.nextInt();
        int[][] a1 = new int[x][y];
        for (int q = 0; q < a1.length; q++) {
            for (int w = 0; w < a[0].length; w++) {
                System.out.print("Masukkan nilai ke-" + q + " ");
                a1[q][w] = input.nextInt();
            }
        }
        System.out.println("Pilih nomor");
        System.out.println("1. Tambah Matriks");
        System.out.println("2. Kurangi Matriks");
        System.out.println("3. Nilai Maksimum baris");
        System.out.println("4. Keluar");
        menu = input.nextInt();
        if (menu == 1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    int jumlah = a[i][j] + a1[i][j];
                    System.out.print(jumlah + " ");
                }
                System.out.println();
            }
        } else if (menu == 2) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    int jumlah = a[i][j] - a1[i][j];
                    System.out.print(jumlah + " ");
                }
                System.out.println();
            }
        } else if (menu == 3) {
        } else if (menu == 4) {
            System.out.println("Terima Kasih");
        } else {
            System.out.println("Inputan anda salah");
        }
    }
}
