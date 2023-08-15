package algoritma;

import java.util.Scanner;

public class Algoritma {

    public static void main(String[] args) {
        int bil;
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan masukkan angka:");
        bil = input.nextInt();
            if (bil % 2 == 0 && bil % 6 != 0 && bil % 15 != 0) {
                System.out.println("Bilangan kelipatan 2");
            }
            if (bil % 6 == 0 && bil % 15 != 0) {
                System.out.println("Bilangan kelipatan 6");
            } if (bil%15==0){
                System.out.println("Bilangan kelipatan 15");
            }else {
                System.out.println("Bilangan bukan kelipatan 2,6, ataupun 15");
            }
       
    }

}
