
package perulangan;
import java.util.Scanner;
public class pertanyaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r=1, i=1, a=2, n=4;
        while (i<=n) {            
            r=r*a;
            System.out.println("iterasi: ["+r+"]["+i+"]["+n+"]");
            i++;
            
        }
        System.out.println(""+r);
    }
    
}
