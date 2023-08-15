package algoritma;

import java.util.Scanner;

public class nomor41 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        int array[][] = new int[4][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Masukkan nilai pada baris ke-[" + i + "][" + j + "]:");
                array[i][j] = input.nextInt();
            }
            System.out.println("");
        }
        for (int i[] : array) {
            for (int j : i) {
                jumlah += j;
            }
        }
        System.out.println("Jumlahnya adalah: " + jumlah);
    }
}
