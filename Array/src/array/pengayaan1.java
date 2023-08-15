
package array;
import java.util.Scanner;
public class pengayaan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil =0;
        System.out.println("Masukkan Array: ");
        int baris = input.nextInt();
        int[]data=new int [baris];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data ke "+i+" :");
            data[i]=input.nextInt();
        }
        for (int i : data) {
            System.out.print(i+ "");
        }
        System.out.println("");
        System.out.print("Masukkan data yang ingin dicari: ");
        int cari = input.nextInt();
        for (int i = 0; i <data.length; i++) {
            if (cari==data[i]) {
                hasil=i;
            }
        }
        System.out.println("Hasil pencarian: ");
        System.out.println("data terdapat pada indek ke= "+ hasil);
    }
}
