package perulangan;

import java.util.Scanner;

public class ulangfor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, fac, i;
        System.out.println("PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR");
        System.out.println("Masukkan Bilangan");
        angka = input.nextInt();
        fac = 1;
        for (i = 1; i <= angka; i++) {
            fac = fac*i;
            System.out.println("iterasi ke ["+i+"] "+fac);
        }
        System.out.println("Nilai faktorial bilangan tersebut adalah: \n"+fac);
            
        }
    }



