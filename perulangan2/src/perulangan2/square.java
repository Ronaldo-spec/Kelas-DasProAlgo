package perulangan2;

import java.util.Scanner;

public class square {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}
