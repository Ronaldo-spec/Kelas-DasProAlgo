package doublelinkedlist;

import java.util.Scanner;

public class mainDoubleLinkedList {

    static Scanner ronaldo = new Scanner(System.in);
    static doubleLinkedList sc = new doubleLinkedList();
    static int data, index, cari;

    static void print() {
        boolean ulang = true;
        while (ulang) {
            System.out.println("---Daftar----");
            System.out.println("1. Tambah Awal");
            System.out.println("2. Tambah Akhir");
            System.out.println("3. Tambah data indeks tertentu");
            System.out.println("4. Hapus Awal");
            System.out.println("5. Hapus Akhir");
            System.out.println("6. Hapus indeks tertentu");
            System.out.println("7. Cetak Data");
            System.out.println("8. Cari Data");
            System.out.println("9. Ulangi");
            System.out.println("10. Urutkan");
            System.out.println("11. Exit");
            int pilih = ronaldo.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("=======================================");
                    System.out.print("Masukkan Data: ");
                    data = ronaldo.nextInt();
                    sc.addFirst(data);
                    break;
                case 2:
                    System.out.println("=======================================");
                    System.out.print("Masukkan Data: ");
                    data = ronaldo.nextInt();
                    sc.addLast(data);
                    break;
                case 3:
                    System.out.println("=======================================");
                    System.out.print("Masukkan Data: ");
                    int data = ronaldo.nextInt();
                    System.out.print("Index ke: ");
                    index = ronaldo.nextInt();
                    sc.add(data, index);
                    break;
                case 4:
                    System.out.println("=======================================");
                    sc.removeFirst();
                    break;
                case 5:
                    System.out.println("=======================================");
                    sc.removeLast();
                    break;
                case 6:
                    System.out.println("=======================================");
                    System.out.print("Index yang dihapus: ");
                    index = ronaldo.nextInt();
                    sc.remove(index);
                    break;
                case 7:
                    System.out.println("=======================================");
                    sc.print();
                    break;
                case 8:
                    System.out.println("=======================================");
                    System.out.print("Masukkan data yang dicari: ");
                    cari = ronaldo.nextInt();
                    sc.get(cari);
                case 9:
                    System.out.println("=======================================");
                    ulang = true;
                    break;
                case 10:
                    System.out.println("=======================================");
                    sc.sort();
                    sc.print();
                    break;
                case 11:
                    System.out.println("=======================================");
                    ulang = false;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        print();
    }
}
