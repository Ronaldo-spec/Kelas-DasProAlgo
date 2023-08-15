package tugas29;

import java.util.Scanner;

public class tanah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah, panjang, lebar, luas;
        System.out.print("Masukkan jumlah tanah: ");
        jumlah = input.nextInt();
        System.out.println("");
        int[][] tanah = new int[jumlah][2];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Tanah ke-" + i);
            System.out.print("Masukkan panjang: ");
            tanah[i][0] = input.nextInt();
            System.out.print("Masukkan lebar: ");
            tanah[i][1] = input.nextInt();
        }
        for (int i = 0; i < jumlah; i++) {
            luas=tanah[i][0]*tanah[i][1];
            System.out.println("Luas tanah ke-"+i+" adalah "+luas);
        }
    }
}
