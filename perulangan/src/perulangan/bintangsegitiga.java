package perulangan;

import java.util.Scanner;

public class bintangsegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 10;
        for (int deret = 1; deret <=jumlah; deret++) {
            for (int baris = 10; baris >0; baris--) {
                System.out.print(" ");
            }
            for (int kolom = 1; kolom <= 10; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
