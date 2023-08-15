
package array;
import java.util.Scanner;
public class arrayinputloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiUAS[]=new int[6];
        for (int i = 0; i <6; i++) {
            System.out.println("Masukkan nilai UAS ke-"+i+": ");
            nilaiUAS[i]=input.nextInt();
        }
        for (int i = 0; i <nilaiUAS.length; i++) {
            if (nilaiUAS[i]>70) {
                System.out.println("Mahasiswa ke-"+i+" lulus");
            } else {
                System.out.println("Mahasiswa ke-"+i+" tidak lulus");
            }
        }
    }
}
