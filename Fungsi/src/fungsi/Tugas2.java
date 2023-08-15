package fungsi;
import java.util.Scanner;
public class Tugas2 {
    static int tampilDeret(int x) {
        if (x==0) {
            return 0;
        } else {
            return x + tampilDeret(x-1);
        }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan Angka: ");
        angka = input.nextInt();
        System.out.println("Hasilnya adalah: "+tampilDeret(angka));
    }
}