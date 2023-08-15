
package algoritma;
import java.util.Scanner;
public class nomor31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo,bunga;
        System.out.println("Masukkan saldo: ");
        saldo=input.nextInt();
        for (int i = 0; i < 12; i++) {
            bunga=saldo*2/100;
            saldo+= bunga;
        }
        System.out.println("Total tabungan selama 12 bulan adalah "+saldo);
    }
}
