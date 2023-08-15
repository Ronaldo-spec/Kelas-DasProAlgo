package minggu8;

import java.util.Scanner;

public class stackMain {

    public static void main(String[] args) {
        String nilai;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya: ");
        int banyak = input.nextInt();
        Stack tumpukan = new Stack(banyak);

        for (int i = 0; i < banyak; i++) {
            System.out.println("Masukkan Nilai ke-"+i+" : ");
            nilai = input.next();
            tumpukan.push(nilai);
        }
       
        
        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}
