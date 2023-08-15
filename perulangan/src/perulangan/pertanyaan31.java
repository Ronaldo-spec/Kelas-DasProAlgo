
package perulangan;
import java.util.Scanner;
public class pertanyaan31 {
    public static void main(String[] args) {
        for (int deret = 10; deret >0 ; deret--) {
            for (int baris = 0; baris <10; baris++) {
                System.out.print(" ");
            }
            for (int kolom = 10; kolom <=1; kolom--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
