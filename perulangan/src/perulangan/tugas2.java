package perulangan;

import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, jumlah = 0, j = 0,k=0,avg;
        System.out.print("Masukkan Bilangan: ");
        angka = input.nextInt();
        for (int i = 1; i <= angka; i += 2) {
            if (i == 0) {
                continue;
            }
            System.out.print(i+" = ");
            k=i*i;
            System.out.print(k + ", ");
            j++;
            jumlah+=k;
        }
        avg=k/j;
        System.out.println("");
        System.out.println("Jumlah bilangan ganjil pada range bilangan " + angka + (" adalah " + jumlah));
        System.out.println("Rata-ratanya adalah: "+avg);
    }
}
