
package testsearching;
import java.util.Scanner;
public class searchingMain {
    public static void main(String[] args) {
        int elemen;
        Scanner input  = new Scanner(System.in);
       
        elemen=input.nextInt();
        int data[]={10, 40,30,50,70,20,100,190};
        System.out.println("Isi Array: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(data[i]);
        }
     System.out.println("=====================");
                Seacrhing pencarian = new Seacrhing(data, 8);
                 System.out.println("Merge Sorting");
pencarian.mergeSort(data, elemen, elemen, elemen);
        pencarian.tampilData();
        
    }
}
