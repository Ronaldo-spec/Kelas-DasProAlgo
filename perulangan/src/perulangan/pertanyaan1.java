
package perulangan;
import java.util.Scanner;
public class pertanyaan1 {
    public static void main(String[] args) {
        System.out.println("Masukkan nilai: ");
        Scanner input = new Scanner(System.in);
        int i=0, n;
        n = input.nextInt();
        while (i<n) {
            System.out.println("*");
            i++;
    }
    }
}
