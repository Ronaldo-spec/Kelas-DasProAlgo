
package arraymultidimensi;
import java.util.Scanner;
public class Arr3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nilai = new int[2][3];
        int i=0, j=0;
        do{
            while(j<3){
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] ");
                nilai[i][j] = input.nextInt();
            }
            System.out.println("------------------------");
        }while(i<2);
        for (int a = 0; i < 2; i++) {
            for (int b = 0; j < 3; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }
}