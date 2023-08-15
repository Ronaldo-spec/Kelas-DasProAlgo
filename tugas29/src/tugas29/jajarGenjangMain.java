
package tugas29;
import java.util.Scanner;
public class jajarGenjangMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        jajarGenjang[]pxArray=new jajarGenjang[5];
        for (int i = 0; i < 5; i++) {
            pxArray[i]=new jajarGenjang(4,4,4);
            System.out.println("Jajar Genjang ke-"+i);
            System.out.print("Masukkan tinggi: ");
            pxArray[i].tinggi=input.nextInt();
            System.out.print("Masukkan panjang: ");
            pxArray[i].panjang=input.nextInt();
            System.out.print("Masukkan Sisi Miring: ");
            pxArray[i].sisiMiring=input.nextInt();
            
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Jajar Genjang ke-"+i);
            System.out.println("Luasnya adalah "+pxArray[i].hitungLuas());
            System.out.println("Kelilingnya adalah "+pxArray[i].hitungKeliling());
        }
    }
   
}
