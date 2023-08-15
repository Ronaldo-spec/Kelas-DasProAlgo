
package array;
import java.util.Scanner;
public class pengayaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tampung;
        System.out.println("Masukkan Array: ");
        int baris = input.nextInt();
        int[] data =new int [baris];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan data ke-"+i+" :");
            data[i] = input.nextInt();
        }
        for (int i : data) {
            System.out.print(i+ "");
        }
        System.out.println("");
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length-1; j++) {
                if (data[j-1]>data[j]) {
                    tampung=data[j-1];
                    data[j-1]=data[j];
                    data[j]=tampung;
                }
            }
        }
        for (int i : data) {
            System.out.print(i +" ");
        }
        System.out.println("");
    }
}
