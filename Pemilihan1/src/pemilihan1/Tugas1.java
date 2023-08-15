package pemilihan1;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Bilangan 1: ");
        a = input.nextInt();
        System.out.println("Bilangan 2: ");
        b = input.nextInt();
        if (a > b) {
            System.out.println(a + " adalah Bilangan Terbesar");
        } else if (a<b) {
            System.out.println(b + " adalah Bilangan Terbesar");
        } else {
            System.out.println("Nilai Sama Besar");
        }
    }

}
