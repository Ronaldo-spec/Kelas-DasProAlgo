package pemilihan2;

import java.util.Scanner;

public class Percobaan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kategori, pekerja, pebisnis;
        double penghasilan, gajipokok, gajippn, gajibersih;
        System.out.println("Masukkan golongan");
        System.out.println("1 = Pekerja");
        System.out.println("2 = Pebisnis");
        kategori = input.nextLine();
        System.out.println("Masukkan Gaji Pokok");
        gajipokok = input.nextDouble();

        if (kategori.equals("pekerja")) {
            if (gajipokok > 3000000) {
                System.out.println("Anda dikenai pajak penghasilan sebesar 10%");
                gajippn = gajipokok * 0.2;
                gajibersih = gajipokok - gajippn;
                System.out.println("Gaji Bersih: " + gajibersih);
            } else if (gajipokok > 1000000 && gajipokok <= 2000000) {
                System.out.println("Anda dikenai pajak penghasilan sebesar 2%");
                gajippn = gajipokok * 0.02;
                gajibersih = gajipokok - gajippn;
                System.out.println("Gaji Bersih: " + gajibersih);
            } else if (gajipokok > 2000000 && gajipokok <= 3000000) {
                System.out.println("Anda dikenai pajak penghasilan sebesar 5%");
                gajippn = gajipokok * 0.05;
                gajibersih = gajipokok - gajippn;
                System.out.println("Gaji Bersih: " + gajibersih);
            } else {
                System.out.println("Anda tidak dikenai pajak");
            }
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (gajipokok > 10000000) {
                System.out.println("Anda dikena pajak sebesar 20%");
                gajippn = gajipokok * 0.2;
                gajibersih = gajipokok - gajippn;
                System.out.println("Gaji Bersih: " + gajibersih);
            } else if (gajipokok > 5000000) {
                System.out.println("Anda dikena pajak sebesar 15%");
                gajippn = gajipokok * 0.15;
                gajibersih = gajipokok - gajippn;
                System.out.println("Gaji Bersih: " + gajibersih);

            } else {
                System.out.println("Anda dikena pajak sebesar 10%");
                gajippn = gajipokok * 0.1;
                gajibersih = gajipokok - gajippn;
                System.out.println("Gaji Bersih: " + gajibersih);
            }
        }

    }

}
