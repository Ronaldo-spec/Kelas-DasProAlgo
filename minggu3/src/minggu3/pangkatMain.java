package minggu3;

import java.util.Scanner;

public class pangkatMain {

    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        Pangkat pp = new Pangkat(7);
        System.out.print("Masukkan jumlah elemen: ");
        pp.elemen = input.nextInt();
        Pangkat[] png = new Pangkat[pp.elemen];
        System.out.println("Pilih menu: ");
        menu = input.nextInt();
        switch (menu) {
            case 1:

                for (int i = 0; i < pp.elemen; i++) {
                    png[i] = new Pangkat(pp.elemen);
                    System.out.println("Masukkan nilai yang akan dipangkatkan ke-" + i + " : ");
                    png[i].nilai = input.nextInt();
                    System.out.print("Masukkan nilai pemnangkat: ");
                    png[i].pangkat = input.nextInt();

                }
                System.out.println("Hasil pangkat dengan Bruce Force: ");
                for (int i = 0; i < pp.elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                System.out.println("Hasil pangkat dengan Divide & Conquer: ");
                for (int i = 0; i < pp.elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + ""
                            + " adalah: " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Terima Kasih");
        }
    }
}
