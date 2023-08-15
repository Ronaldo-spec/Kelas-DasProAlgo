package array;

import java.util.Scanner;

public class rataNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mhs;
        System.out.println("Masukkan jumlah Mahasiswa: ");
        mhs = input.nextInt();
        int[] nilaiMHS = new int[mhs];
        int total = 0, x = 0, z = 0;
        double rataL, rataT,totalL=0,totalT=0,jumlah1,jumlah2;
        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMHS[i] = input.nextInt();
            if (nilaiMHS[i] > 70) {
                totalL += nilaiMHS[i];
                x++;
            } else {
                totalT += nilaiMHS[i];
                z++;
            }
        }
        if (totalL == 0 && x == 0) {
            jumlah2 = totalT / z;
            System.out.println("Nilai rata-rata mahasiswa yang tidak lulus: " + jumlah2);
        } else if (totalT == 0 && x == 0) {
            jumlah1 = totalL / x;
            System.out.println("Nilai rata-rata mahasiswa yang lulus: " + jumlah1);
        } else {
            rataL = totalL / x;
            System.out.println("Nilai rata-rata Mahasiswa lulus: " + rataL);
            rataT = totalT / z;
            System.out.println("Nilai rata-rata Mahasiswa Tidak Lulus: " + rataT);
        }

    }
}