
package algoritma;

public class missisipi {
    public static void main(String[] args) {
        char[] mississipi = {'M', 'I', 'S', 'S', 'I', 'S', 'S', 'I', 'P', 'I'};
        char kata = (char)mississipi.length;
        int banyakM = 0, banyakI = 0, banyakS = 0, banyakP = 0, x;

        for (int i = 0; i < kata; i++) {
            System.out.println(mississipi[i]);
        }
        for (int j = 0; j < mississipi.length; j++) {

            if (mississipi[j] == 'M') {
                banyakM += 1;
            } else if (mississipi[j] == 'I') {
                banyakI += 1;
            } else if (mississipi[j] == 'S') {
                banyakS += 1;
            } else {
                banyakP += 1;
            }
        }
        System.out.println("Banyak Huruf M = " + banyakM);
        System.out.println("Banyak Huruf I = " + banyakI);
        System.out.println("Banyak Huruf S = " + banyakS);
        System.out.println("Banyak Huruf P = " + banyakP);

    }
    
}
