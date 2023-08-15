
package minggu4;

public class nomor2 {
    int divide(int n){
        if (n<=1) {
            return 1;
        } else {
            return divide(n - 1) + divide(n - 2);
        }
    }
}
