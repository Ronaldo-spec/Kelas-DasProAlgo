
package minggu4;

import java.util.Scanner;


public class mainMinMax {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        minMax[]ppArray=new minMax[5];
        ppArray[0]=new minMax();
        for (int i = 0; i < 5; i++) {
            ppArray[i]=new minMax();
            System.out.println("Nilai array indeks ke-"+i);
            System.out.print("Masukkan nilai: ");
            ppArray[i].nilaiArray=input.nextInt();
        }
        int min=ppArray[0].nilaiArray;
        int max=ppArray[0].nilaiArray;
        for (int i = 0; i < 5; i++) {
            if (ppArray[i].nilaiArray<min) {
                min=ppArray[i].nilaiArray;
            } else if(ppArray[i].nilaiArray>max){
                max=ppArray[i].nilaiArray;
            }
        }
        System.out.println("Bruce Force");
        System.out.println("Nilai Minimal: "+min);
        System.out.println("Nilai Maksimal: "+max);
        
        int arr[]=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=ppArray[i].nilaiArray;
        }
        
        maxMin hasil = new maxMin();
        minMax hitung = new minMax();
        hitung.max_min(arr,0,4,hasil);
        System.out.println("Divide Conquer");
        System.out.println("Nilai Minimal: "+hasil.minimum+" \nNilai Maksimalnya: "+hasil.maximum);
        System.out.println("\n");
    }
}
