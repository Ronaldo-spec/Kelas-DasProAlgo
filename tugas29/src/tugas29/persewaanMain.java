package tugas29;

import java.util.Scanner;

public class persewaanMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        persewaan sw = new persewaan();
        System.out.print("Nama Game: ");
        sw.game=input.nextLine();
        System.out.print("Nama: ");
        sw.nama = input.nextLine();
        System.out.print("Nomor ID: ");
        sw.noID = input.nextInt();
        System.out.print("Lama Pinjam: ");
        sw.lamaPinjam = input.nextInt();

        sw.tampilBarang();

        sw.bayar();

    }
}
