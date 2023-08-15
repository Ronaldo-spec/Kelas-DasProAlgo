
package pemilihan1;

import java.util.Scanner;
    public class Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a,b,jumlah;
        System.out.println("Masukkan nilai 1: ");
        a = input.nextFloat();
        System.out.println("Masukkan nilai 2: ");
        b = input.nextFloat();
        jumlah=(a+b)/2;
        if (jumlah>100) {
            jumlah-=5; 
         
        }
        System.out.println("Hasil Nilai Akhir adalah: " + jumlah);
    }
    
}
