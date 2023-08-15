package tugas29;

import java.util.Scanner;

public class nilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int siswa, c = 1, maks = 1, a = 0;
        System.out.print("Masukkan Jumlah Siswa: ");
        siswa = input.nextInt();
        int[][] nilai = new int[siswa][2];
        for (int i = 0; i < siswa; i++) {
            System.out.println("Mahasiswa ke-" + i);
             System.out.println("Masukkan nilai ke-1: ");
             nilai[i][0]=input.nextInt();
             System.out.println("Masukkan nilai ke-2: ");
             nilai[i][1]=input.nextInt();
        }
       

        for (int k = 0; k < siswa; k++) {
            if (nilai[k][0] > nilai[k][1]) {
                maks = nilai[k][0];
                
            } else if (nilai[k][0] < nilai[k][1]) {
                maks = nilai[k][1];
               
            } else if (nilai[k][0] == nilai[k][1]) {
                maks = nilai[k][0];
            }
            System.out.println("Nilai terbesar mahasiswa ke-" + k + " adalah " + maks);
            a++;
        }

    }
}
