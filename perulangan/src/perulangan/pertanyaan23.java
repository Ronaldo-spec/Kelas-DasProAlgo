package perulangan;

import java.util.Scanner;

public class pertanyaan23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5;
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        System.out.println(n+"!="+hasil);
    }
}
