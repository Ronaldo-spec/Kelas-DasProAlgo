package perulangan2;

import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris;
        System.out.println("Masukkan jumlah baris: ");
        baris = input.nextInt();
        for (int i = 0; i <= baris; i++) {
            for (int j = baris - 1; j >= i; j--) {
                System.out.print(" ");
                
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
} 