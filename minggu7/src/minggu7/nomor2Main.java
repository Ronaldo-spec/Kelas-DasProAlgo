package minggu7;

import java.util.Scanner;

public class nomor2Main {

    public static void main(String[] args) {
        int Baris,Kolom;
        Scanner input = new Scanner(System.in);
        int cari, posisi;
        int data[][] = new int[3][5];
        nomor2 sc = new nomor2(data, 3, 5);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Baris " + i + " Kolom " + j + " :");
                sc.data[i][j] = input.nextInt();
            }
        }
        System.out.println("Isi Data: ");
        sc.tampilData();
        System.out.println("Masukkan nilai yang dicari: ");
        cari = input.nextInt();
        Baris = sc.sequential(cari);
        Kolom=sc.sequential1(cari);
        System.out.println("Data ada pada baris ke- "+Baris+" Kolom ke- "+Kolom);
        
    }
}
