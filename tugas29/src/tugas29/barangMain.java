
package tugas29;
import java.util.Scanner;
public class barangMain {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Barang input = new Barang();
        System.out.print("Masukkan nama barang: ");
        input.namaBarang=sc.nextLine();
        System.out.print("Masukkan harga: ");
        input.hargaSatuan=sc.nextInt();
        System.out.print("Masukkan jumlah: ");
        input.jumlah=sc.nextInt();
        input.tampilBarang();
        input.hitungTotal();
        input.hitungDiskon();
        input.hitungBayar();
    }
}
