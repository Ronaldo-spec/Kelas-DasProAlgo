package algoritma;
import java.util.Scanner;
public class bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo, jumlah;
        int bln =1;
        System.out.print("Masukkan saldo: ");
        saldo=input.nextDouble();
        while (saldo<1500000) {
            
            System.out.println("Bulan ke "+bln+" saldo "+saldo);
            saldo  += saldo*0.02;
            bln++;
            
            
        }
    }

}
