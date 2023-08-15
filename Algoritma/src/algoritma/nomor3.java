
package algoritma;
import java.util.Scanner;
public class nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan angka: ");
        angka=input.nextInt();
        for (int i = 0; i < 5; i++) {
            angka-=3;
        }
        System.out.println("dikurangi 3 selama 5 kali hasilnya adalah "+angka);
        if (angka%2==0) {
            System.out.println(angka+" adalah bilangan genap");
        } else {
            System.out.println(angka+" adalah bilangan ganjil");
        }
    }
}
