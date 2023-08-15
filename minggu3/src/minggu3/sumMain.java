
package minggu3;
import java.util.Scanner;
public class sumMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program menghitung keuntungan total");
        System.out.println("Masukkan jumlah bulan");
        int bulan = input.nextInt();
        sum sm=new sum(bulan);
        for (int i = 0; i < sm.elemen; i++) {
            System.out.println("Masukkan untung bulan ke-"+i+": ");
            sm.keuntungan[i]=input.nextInt();
        }
        System.out.println("Algoritma Bruce Force: ");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah: "+sm.totalBF(sm.keuntungan));
        System.out.println("Algoritma Divide Conquer: ");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah: "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
