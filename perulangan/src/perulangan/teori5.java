package perulangan;

import java.util.Scanner;

public class teori5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil = 0, n, jawab = 0;
        System.out.println("Masukkan bilangan: ");
        n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i + "");
            hasil += i;
            if (i != n) {
                System.out.print(" + ");
            } else {
                System.out.println("= ");
            }

            System.out.println("Apakah anda ingin mengulangi?");
            System.out.println("1. YA");
            System.out.println("2. TIDAK");
            jawab = input.nextInt();
        }
        System.out.println(hasil);
    }
}
