package algoritma;

import java.util.Scanner;

public class fungsi1 {

    static int fibo(int acci) {
        if (acci == 0 || acci == 1) {
            return acci;
        } else {
            return (fibo(acci - 1) + fibo(acci - 2));
        }
    }

    public static void main(String[] args) {
        int i, j = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret fibonacci: ");
        int acci = input.nextInt();
        for (i = 0; i < acci; i++) {
            System.out.print(fibo(j) + " ");
            j++;
        }
        System.out.println();
    }
}
