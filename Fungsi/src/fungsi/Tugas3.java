package fungsi;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.I;

public class Tugas3 {

    static void tampilDeret(int x) {
        for (int i = x; i <= x; i++) {
            int a = 0;
            for (int h = 1; h <= i; h++) {
                if (x % h == 0) {
                    a = a + 1;
                }
            }
            if (a == 2) {
                System.out.println(x + "  => Bilangan Prima ");
            } else {
                System.out.println(x + "  => Bukan Bilangan Prima ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka: ");
        int angka = input.nextInt();
        tampilDeret(angka);

    }

}