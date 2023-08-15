
package minggu5;
import java.util.Scanner;
public class mainNomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        daftarNomor2 sc = new daftarNomor2();
        for (int i = 0; i < 20; i++) {
            System.out.print("Nama Klub: ");
            String nama=input.next();
            System.out.print("Points: ");
            int points = input.nextInt();
            nomor2 n =new nomor2(nama,points);
            sc.tambah(n);
        }
        System.out.println("===================================================");
        System.out.println("Urutan Peringkat secara Ascending");
        sc.insertionSort(true);
        sc.tampil();
         System.out.println("===================================================");
         System.out.println("Urutan Peringkat secara Descending");
         sc.insertionSort(false);
         sc.tampil();
         System.out.println("===================================================");
    }
}
