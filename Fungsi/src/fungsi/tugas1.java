
package fungsi;
import java.util.Scanner;
public class tugas1 {
    static void tampilDeret(int x) {
        if (x >= 0) {
            System.out.print(x + " ");
            
            tampilDeret(x - 1);
        } else {
            System.out.println();
        }
    }

    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka: ");
        angka=input.nextInt();
        tampilDeret(angka);
    }
}