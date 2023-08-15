
package perulangan2;
import java.util.Scanner;
public class tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka,k,x,z;
        System.out.println("Masukkan angka: ");
        angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                for (k=angka-1;k>=j;k--) {
                    System.out.print(" ");
                }
                for ( x = 0; x < j; x++) {
                    System.out.print("*");
                }
                for ( z= 1; z < j; z++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
