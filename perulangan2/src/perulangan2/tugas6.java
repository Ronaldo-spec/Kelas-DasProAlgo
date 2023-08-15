
package perulangan2;
import java.util.Scanner;
public class tugas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka,z=1, x=2;
        boolean lanjut=true;
        System.out.println("Masukkan Angka: ");
        angka = input.nextInt();
        while (z<=angka) {            
            lanjut=true;
            for (int y = 2; y <= x; y++) {
                if (x %y==0) {
                    lanjut = false;
                }
            }
            if (lanjut) {
                System.out.print(x + " ");
                z++;
            }
            x++;
        }
    }
}
