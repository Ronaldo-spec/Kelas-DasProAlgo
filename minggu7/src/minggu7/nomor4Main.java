
package minggu7;
import java.util.Scanner;
public class nomor4Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        daftarNomor4 sc = new daftarNomor4();
        System.out.print("Masukkann jumlah penduduk: ");
        sc.jmlData=input.nextInt();
        daftarNomor4[]array=new daftarNomor4[sc.jmlData];
        for (int i = 0; i < sc.jmlData; i++) {
            array[i]=new daftarNomor4();
            System.out.println("Penduduk ke-"+i);
           System.out.print("Nama: ");
            array[i].nama=input1.nextLine();
            System.out.print("Alamat: ");
            array[i].alamat = input1.nextLine();
            System.out.print("Jenis Kelamin: ");
            array[i].kelamin = input1.nextLine();
            System.out.print("NIK: ");
            array[i].nik = input.nextInt();
            
        }
        System.out.println("Data Penduduk");
        for (int i = 0; i < sc.jmlData; i++) {
            System.out.println(array[i].nama);
            System.out.println(array[i].alamat);
            System.out.println(array[i].kelamin);
            System.out.println(array[i].nik);
            System.out.println("=======================");
        }
        System.out.print("Masukkan data yang dicari (NIK): ");
        int cari = input.nextInt();
        for (int j = 0; j < sc.jmlData; j++) {
            if (cari==array[j].nik) {
                System.out.println("DATA DITEMUKAN");
            System.out.println(array[j].nama);
            System.out.println(array[j].alamat);
            System.out.println(array[j].kelamin);
            System.out.println(array[j].nik);
                break;
            }else {
                System.out.println("Data Tidak Ada");
            }
        }
        return;
     
    }
    }

