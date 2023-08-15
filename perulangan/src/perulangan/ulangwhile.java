package perulangan;

import java.util.Scanner;

public class ulangwhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, fac, i;
        System.out.println("PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE");
        System.out.println("Masukkan bilangan");
        angka = input.nextInt();
        fac = 1;
        i = 1;
        while (i <= angka) {
        }
        fac = fac * 1;
        i++;
        System.out.println("Nilai faktorial bilangan tersebut adalah: " + fac);
    }
}
