
package perulangan;
import java.util.Scanner;
public class whilebreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka,b;
            System.out.println("PROGRAM WHILE LOOP DENGAN BREAK");
            b=0;
            while (true) {
                System.out.println("Masukkan bilangan: ");
                angka = input.nextInt();
                b+=angka;
                System.out.println("Jumlah: "+b);
                if (b>50) break;
            }
            System.out.println("Angka berjumlah: "+b);
        }
    
    
}
