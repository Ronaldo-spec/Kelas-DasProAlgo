
package perulangan2;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();
        for (int baris = 0; baris < angka; baris++) {
            if (baris==0 || baris==angka-1) {
                for (int i = angka; i >0; i--) {
                    System.out.print(angka);
                }
            } else { 
                System.out.print(angka);
                for (int i = angka-2; i>0; i--) {
                    System.out.print(" ");
                }
                System.out.print(angka);
            }
            System.out.println("");
            }
        }
    }

