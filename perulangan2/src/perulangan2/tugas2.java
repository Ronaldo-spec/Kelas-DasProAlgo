package perulangan2;

import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = baris; k >= i; k--) {
                System.out.print("*");
            }
            for (int f = baris-1; f >=i; f--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= baris; i++) {
            for (int j = baris; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");    
            }
            for (int f = 2; f <= i; f++) {
                System.out.print("*");
            }
            System.out.println();
        }   
}
}
