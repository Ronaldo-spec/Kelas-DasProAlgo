
package perulangan;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        int angka, jumlah,count,j=0;
        double avg;
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        angka = input.nextInt();
        jumlah = angka/2;
        System.out.println("Jumlah bilang genap pada range bilangan "+angka+(" adalah: "+jumlah));
        for (int i = 0; i <= angka; i+=2) {
            if ( i == 0) continue;
            System.out.print(i+ " ");
            j += i;
        }
        System.out.println("");
        System.out.println("total semua : "+j);
        avg=j/jumlah;
        System.out.println("Rata-ratanya adalah: "+avg);
    }
}