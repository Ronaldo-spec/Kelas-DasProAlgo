package fungsi;

import java.util.Scanner;

public class Percobaan3 {

    static double hitungBunga(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 2 * hitungBunga(saldo, tahun - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        System.out.print("Jumlah saldo awal: ");
        saldoAwal = input.nextInt();
        System.out.print("Lamanya menabung (tahun): ");
        tahun = input.nextInt();
        System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
        System.out.println(hitungBunga(saldoAwal, tahun));
    }
}
