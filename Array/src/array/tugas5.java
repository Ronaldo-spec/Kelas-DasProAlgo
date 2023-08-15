
package array;
import java.util.Scanner;
public class tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan array: ");
        int array, max=0;
        array=input.nextInt();
        int baris[]= new int [array];
        for (int i = 0; i < baris.length; i++) {
            System.out.println("Masukkan Array ke-"+i+" :");
            baris[i]=input.nextInt();
        }
        for (int i = 0; i < baris.length; i++) {
            if (max<baris[i]) {
                max=baris[i];
            }
        }
        System.out.println(max+" merupakan bilangan terbesar");
    }
}
