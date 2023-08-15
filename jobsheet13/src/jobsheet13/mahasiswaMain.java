
package jobsheet13;
import java.util.Scanner;
public class mahasiswaMain {
        static Scanner ronaldo = new Scanner(System.in);
    static mahasiswa sc = new mahasiswa();
    static int nilai, index;
    static String nama,cari;
static void print() {
        boolean ulang = true;
        while (ulang) {
            System.out.println("Daftar");
            System.out.println("1. Masukkan data");
            System.out.println("2. Cetak Data");
            System.out.println("3. Urutkan Data");
            System.out.println("4. Exit");
            int pilih = ronaldo.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama=ronaldo.next();
                    System.out.print("Masukkan nilai: ");
                    nilai=ronaldo.nextInt();
                    sc.addFirst(nama, nilai);
                    break;
                case 2:
                    sc.print();
                    break;
                case 3:
                    sc.sort();
                    break;
                case 4:
                    ulang=false;
            }
        }
        }
    public static void main(String[] args) {
        print();
    }
}
