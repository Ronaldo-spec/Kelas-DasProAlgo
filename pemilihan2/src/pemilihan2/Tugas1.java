package pemilihan2;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi1, sisi2, sisi3;
        System.out.println("Masukkan sisi 1 segitiga: ");
        sisi1 = input.nextInt();
        System.out.println("Masukkan sisi 2 segitiga: ");
        sisi2 = input.nextInt();
        System.out.println("Masukkan sisi 3 segitiga: ");
        sisi3 = input.nextInt();
        if (sisi1==sisi2 && sisi2==sisi3 && sisi3==sisi1){
            System.out.println("Segitiga Sama Sisi");
        } else if (sisi1==sisi2) {
            System.out.println("Segitiga Sama Kaki");
        } else {
            System.out.println("Segitiga Sembarang");
        }
        
    } 
}
