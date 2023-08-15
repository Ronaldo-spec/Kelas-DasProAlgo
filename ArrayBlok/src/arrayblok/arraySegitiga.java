
package arrayblok;
import java.util.Scanner;
public class arraySegitiga {
 
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        segitiga[]pkArray= new segitiga[4];
        for (int i = 0; i < pkArray.length; i++) {
            pkArray[i]=new segitiga(3,3);
            System.out.println("Segitiga ke-"+i);
            System.out.print("Masukkan alas: ");
            pkArray[i].alas=input.nextInt();
            System.out.print("Masukkan tinggi: ");
            pkArray[i].tinggi=input.nextInt();
        }
        for (int i = 0; i < pkArray.length; i++) {
        System.out.println("Segitiga ke-"+i);
            System.out.println("Luasnya adalah: "+pkArray[i].hitungLuas());
            System.out.println("Kelilingnya adalah: "+pkArray[i].hitungKeliling());
        }
    }
}
