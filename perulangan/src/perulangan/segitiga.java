package perulangan;

import java.util.Scanner;

public class segitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int deret = 0; deret <10; deret++) {
            for (int deret = 4; baris >=deret ; baris--) {
                System.out.print(" ");
            }
            for (int kolom = 1; kolom <= deret ; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
