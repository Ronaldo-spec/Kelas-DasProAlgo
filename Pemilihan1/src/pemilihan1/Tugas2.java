package pemilihan1;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;
        System.out.println("Masukkan Umur Anda: ");
        umur = input.nextInt();
        if (umur >= 17) {
            System.out.println("Anda boleh berkendara sendiri");

        } else {
            System.out.println("Anda belum boleh berkendara sendiri");
        }
    }

}
