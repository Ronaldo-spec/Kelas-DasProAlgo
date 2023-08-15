package minggu5;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        daftarMahasiswaBerprestasi data = new daftarMahasiswaBerprestasi();
        System.out.println("Masukkan jumlah mahasiswa: ");
        data.jmlMhs=s.nextInt();
        for (int i = 0; i < data.jmlMhs; i++) {
            System.out.print("Nama: ");
            String nama = s1.nextLine();
            System.out.print("Tahun Masuk: ");
            int tahun = s.nextInt();
            System.out.print("Umur: ");
            int umur = s.nextInt();
            System.out.print("IPK: ");
            double ipk = s.nextDouble();
            mahasiswa m = new mahasiswa(nama,tahun,umur, ipk);
            data.tambah(m);
        }
        System.out.println("Data Mahasiswa semula: ");
        data.tampil();
        System.out.println("Data Mahasiswa terurut (Descending): ");
        data.bubbleSort();
        data.tampil();
        System.out.println("Data Mahasiswa terurut (Ascending)");
        data.selectionSort();
        data.tampil();
        System.out.println("Data Mahasiswa terurut (insertion Sort)");
        System.out.println("Model urutan");
        System.out.println("Ascending: ");
        data.insertionSort(true);
        data.tampil();
        System.out.println("Descending: ");
        data.insertionSort(false);
        data.tampil();
    }
}
