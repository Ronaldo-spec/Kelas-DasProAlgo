
package minggu3;
import java.util.Scanner;
public class mainNomor1 {
    
    public static void main(String[] args) {
        int jumlah;
        double total=0,akhir;
        Scanner input = new Scanner(System.in);
        nomor1 sc = new nomor1();
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah=input.nextInt();
         nomor1[] array = new nomor1 [jumlah];
        for (int i = 0; i < jumlah; i++) {
            array[i]=new nomor1();
            System.out.print("Nama Mahasiswa: ");
            array[i].namaMhs=input.next();
            System.out.print("Masukkan Nilai Tugas: ");
            array[i].nilaiTugas=input.nextInt();
            System.out.print("Masukkan Nilai Kuis: ");
            array[i].nilaiKuis=input.nextInt();
            System.out.print("Masukkan Nilai UTS: ");
            array[i].nilaiUTS=input.nextInt();
            System.out.print("Masukkan Nilai UAS: ");
            array[i].nilaiUAS=input.nextInt();
            sc.hitung();
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa "+array[i].namaMhs+" adalah: ");
            array[i].hitung();
            array[i].tampil();
            
        }
        for (int i = 0; i < jumlah; i++) {
             total+=array[i].hitung();
        }
       akhir=total/jumlah;
        System.out.println("Rata-rata nilai keseluruhan mahasiswa adalah: "+akhir);
    }
}
