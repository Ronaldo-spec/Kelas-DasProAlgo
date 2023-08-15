
package array;
import java.util.Scanner;
public class teori2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Array: ");
        int array = input.nextInt();
        int baris[] = new int [array];
        for (int i = 0; i < baris.length; i++) {
            System.out.println("Masukkan Data ke-"+i+" : ");
            baris[i]=input.nextInt();
        }
        for (int j : baris) {
            System.out.print(j+" ");
        }
    }
}
