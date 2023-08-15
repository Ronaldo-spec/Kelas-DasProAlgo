
package minggu7;
import java.util.Scanner;
public class nomor3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elemen,cari,maks;
        System.out.print("Masukkan jumlah elemen: ");
        elemen=input.nextInt();
        int data[]=new int[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan elemen ke-"+i+" ");
            data[i]=input.nextInt();
        }
        nomor3 sc= new nomor3(data, elemen);
        System.out.println("Isi Array: ");
       sc.tampilData();
        System.out.println("Data Terurut:");
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 1; j < data.length-i; j++) {
                if (data[j] > data[j - 1]) {
                   int tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
    
        sc.tampilData();
       int min=data[0];
        int max=data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i]<min) {
                min=data[i];
            } else if(data[i]>max){
                max=data[i];
            }
        }
        System.out.println("Maksimal: "+max);
        }
}

