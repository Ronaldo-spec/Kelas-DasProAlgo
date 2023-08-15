package arraymultidimensi;

import java.util.Scanner;

public class quizarray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, c = 0, pilih;
        float total = 0, rata;
        System.out.println("1. Masukkan Array: ");
        System.out.println("2. Diagonal kiri");
        System.out.println("3. Keluar");
        pilih = input.nextInt();
        
        
            System.out.println("Masukkan jumlah baris: ");
            baris = input.nextInt();
            System.out.println("Masukkan jumlah kolom: ");
            kolom = input.nextInt();
            int[][] a = new int[baris][kolom];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print("Masukkan bilangan ke-" + i + " ");
                    a[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < baris; i++) {
                for (int j = kolom-1; j >= 0; j--) {
                    if (i == j) {
                        total += a[i][j];
                        c++;
                    }
                }
            }
            System.out.println("Jumlahnya adalah: " + total);
            rata = total / c;
            System.out.println("Rata-ratanya adalah: " + rata);
        
            System.out.println("Anda telah keluar");
        }
    }

