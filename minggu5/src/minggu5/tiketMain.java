
package minggu5;
import java.util.Scanner;
public class tiketMain {
    static tiket listTiket[]=new tiket[3];
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        tiket sc = new tiket();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Nama: ");
            sc.listTiket[i].nama=input.nextLine();
            System.out.println("Harga: ");
            sc.listTiket[i].harga=input.nextFloat();
            System.out.println("Banyak Tiket: ");
            sc.listTiket[i].Tiket=input.nextInt();
        }
        System.out.println("Data secara Bubble Sort: ");
        sc.bubbleSort();
        sc.tampil();
        System.out.println("Data secara Selection Sort");
        sc.selectionSort();
        sc.tampil();
    }
}
