
package array;
import java.util.Scanner;
public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan: ");
        String inputan = input.nextLine();
        String data[] = inputan.split(" ");
        int dataAngka[]= new int [data.length];
        for (int i = 0; i < data.length; i++) {
            dataAngka[i]=Integer.parseInt(data[i]);
        }
        for (int i = 0; i < dataAngka.length; i++) {
            System.out.print(dataAngka[i]);
        }
    }
}
