
package minggu3;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class faktorialMAIN {
    public static void main(String[] args) {
        double hasil,hasil2,total=0,total2=0,waktu,waktu2;
        faktorial sc = new faktorial ();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = input.nextInt();
        faktorial[]fk=new faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i]=new faktorial();
            System.out.print("Masukkan nilai data ke-"+i+" : ");
            fk[i].nilai=input.nextInt();
        }
        System.out.println("Hasil faktorial dengan Brute Force");
        for (int i= 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialDC(fk[i].nilai));
        }
       
        System.out.println("Hasil faktorial dengan Divide dan Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah: "+sc.faktorialDC(fk[i].nilai));
       
        }
       
   
}
}