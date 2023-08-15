package array;

import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array;
        System.out.println("Masukkan Array: ");
        array=input.nextInt();
        int baris[]=new int[array];
        for (int i = 0; i <array; i++) {
            System.out.println("Masukkan array ke-"+i+": ");
            baris[i]=input.nextInt();
        }
        for (int i = 0; i < baris.length; i++) {
            if (baris[i]%2==0) {
               System.out.println(baris[i]+" Merupakan bilangan GENAP");
            }else{
                System.out.println(baris[i]+" Merupakan bilngan GANJIL");
            }
        }
    }
}
