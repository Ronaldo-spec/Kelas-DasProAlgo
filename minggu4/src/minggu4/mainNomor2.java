
package minggu4;
import java.util.Scanner;
public class mainNomor2 {
    public static void main(String[] args) {
        int angka,t1=0,t2=1;
        Scanner input = new Scanner(System.in);
        nomor2 bp = new nomor2();
        System.out.println("Masukkan angka: ");
        angka=input.nextInt();
        System.out.println("Divide and Conquer: "+bp.divide(angka));
        System.out.println("Brute Force: ");
        for (int i = 1; i <= angka; ++i) {
            System.out.print(t1+" + ");
            int sum = t1+t2;
            t1=t2;
            t2=sum;
        }
        
    }
}
