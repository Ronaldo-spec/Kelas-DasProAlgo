
package Buku_ronaldo;
import java.util.Scanner;
public class mainBuku_ronaldo {
    static Scanner ronaldo = new Scanner(System.in);
    static doubleLinkedList sc = new doubleLinkedList();
    static int kode, index, cari,stok,rusak;
    static String judul,penerbit;
    static void print() {
        boolean ulang = true;
        while (ulang) {
            System.out.println("---PILIH MENU---");
            System.out.println("1. Buku Masuk");
            System.out.println("2. Buku Keluar");
            System.out.println("3. Buku Rusak");
            System.out.println("4. Tampilkan Semua Data");
            System.out.println("5. Cari Buku");
            System.out.println("6. Exit");
            int pilih = ronaldo.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan kode buku: ");
                    kode = ronaldo.nextInt();
                    System.out.print("Masukkan judul buku: ");
                    judul=ronaldo.next();
                    System.out.print("Penerbit: ");
                    penerbit=ronaldo.next();
                    System.out.print("Jumlah Stok: ");
                    stok=ronaldo.nextInt();
                    System.out.print("Jumlah yang rusak: ");
                    rusak=ronaldo.nextInt();
                    sc.add(kode, judul, penerbit, stok, rusak, index);
                    break;
                case 2:
                    System.out.print("Masukkan nomor index buku yang keluar: ");
                    int out = ronaldo.nextInt();
                    sc.remove(out);
                    break;
                case 3:
                    System.out.print("Masukkan kode buku yang rusak: ");
                    int yang = ronaldo.nextInt();
                    System.out.print("Masukkan jumlah buku yang rusak: ");
                    int jumlah = ronaldo.nextInt();
                    break;
                case 4:
                    sc.print();
                    break;
                case 5:
                    ulang = false;
            }
        }
    }
    public static void main(String[] args) {
        print();
    }
}

