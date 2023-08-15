package array;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan Array: ");
        angka = input.nextInt();
        int[] john = new int [angka];
        for (int i = john.length-1; i >=0; i--) {
            System.out.print("Masukkan angka: ");
            john [i] = input.nextInt();
        }
        System.out.println("");
        for (int i :john) {
            System.out.println(i +" ");
        }
    }
}
