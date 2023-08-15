package perulangan;

import java.util.Scanner;

public class dowhilebreak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, b;
        System.out.println("PROGRAM DO WHILE LOOP DENGAN BREAK");
        b = 0;
        do {
            System.out.println("Masukkan bilangan: ");
            angka = input.nextInt();
            b += angka;
            System.out.println("Jumlah: "+b);
            if (b >= 50) {
                break;
            }
        } while (true);
        System.out.println("Angka berhenti pada: "+b);
    }

}
