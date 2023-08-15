
package perulangan;
import java.util.Scanner;
public class ulangcontinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, b, i , count;
        double avg, total;
        System.out.println("PROGRAM LOOP DENGAN CONTINUE");
        b=0;
        count=0;
        for (i=0;i<5;i++) {
            System.out.println("Masukkan bilangan");
            angka = input.nextInt();
            if (angka >=50)continue;
            b+=angka;
            count ++;
            
    }
        total=(double)b;
        System.out.println("Jumlah angka kurang dari 50: "+total);
        avg=(double)b/count;
        System.out.println("Rata-rata angka kurang dari 50: "+avg);
    }
}
