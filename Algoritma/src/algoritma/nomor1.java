
package algoritma;

import java.util.Scanner;

public class nomor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaiTugas, nilaiUts, nilaiUas, total, tugas, uts, uas;
        System.out.println("Masukkan nilai tugas: ");
        tugas = input.nextDouble();
        if (tugas < 0 || tugas > 100) {
            System.out.println("Inputan nilai salah");
            main(args);
        }
        System.out.println("Masukkan nilai UTS");
        uts = input.nextDouble();
        if (uts < 0 || uts > 100) {
            System.out.println("Inputan nilai salah");
            main(args);
        }
        System.out.println("Masukkan nilai UAS");
        uas = input.nextDouble();
        if (uas < 0 || uas > 100) {
            System.out.println("Inputan nilai salah");
            main(args);
        }
        nilaiTugas = tugas * 0.2;
        nilaiUts = uts * 0.35;
        nilaiUas = uas * 0.45;
        total = nilaiTugas + nilaiUts + nilaiUas;
        System.out.println("IP nilainya adalah " + total);
    }

}
