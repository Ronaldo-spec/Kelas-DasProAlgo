
package minggu5;
import java.util.Scanner;
public class utsMain {
    public static void main(String[] args) {
        int baris, kolom;
        boolean ulang = true;
        Scanner ronaldo = new Scanner(System.in);
        int  posisi;
        System.out.println("=== UTS PRAKTIKUM ASD TI - 1 C ===");
        System.out.println("Dibuat oleh : Ronaldo Firmansyah");
        System.out.println("NIM : 1941720117");
        while (ulang){
        char data[]={'r','o','n','a','l','d','o',' ','f','i','r','m','a','n','s','y','a','h'};
        uts sc = new uts (data);
        System.out.println("Isi Data: ");
       sc.tampildata();
        System.out.println("");
        System.out.println("Cari huruf yang dicari: ");
        char cari = ronaldo.next().charAt(0);
        System.out.println("Pilih model searching: ");
        System.out.println("1. Sequential Search");
        System.out.println("2. Binary Search");
        int pilih = ronaldo.nextInt();
        switch (pilih) {
            case 1:
                sc.sequential(cari);
                break;
                
            case 2:
                sc.FindBinarySearch(data,cari, 9, 9);
                break;
    }
        System.out.println("ingin mengulangi lagi?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                int jawab = ronaldo.nextInt();
                if (jawab==2) {
                ulang=false;
            } 
            }
        }
}
