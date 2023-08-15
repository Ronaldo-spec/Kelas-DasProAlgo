
package algoritma;
import java.util.Scanner;
public class fungsi {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci: ");
        int acci = input.nextInt();
        long fib[] = new long[acci];
         
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < acci; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < acci; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
 
}

