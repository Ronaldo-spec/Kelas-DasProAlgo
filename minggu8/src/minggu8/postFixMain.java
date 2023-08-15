
package minggu8;
import java.util.Scanner;
public class postFixMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika: ");
        Q = input.nextLine();
        Q=Q.trim();
        Q=Q+")";
        int total = Q.length();
        postfix post = new postfix(total);
        P= post.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}
