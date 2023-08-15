
package fungsi;

public class deret {
    static void tampilDeret(int x) {
        if (x > 0) {
            System.out.print(x + " ");
            tampilDeret(x - 1);
        } else {
            System.out.println();
        }
    }
    
public static void  main(String[] args) {
        tampilDeret(5);
    }
}