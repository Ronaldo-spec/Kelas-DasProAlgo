
package perulangan;
import com.sun.glass.ui.SystemClipboard;
import java.util.Scanner;
public class forbreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, b;
        System.out.println("PROGRAM LOOP BREAK");
        for (b=0; true;){
            System.out.println("Masukkan bilangan: ");
            
            angka = input.nextInt();
            System.out.println("ditambah: "+b);
            b+=angka;
            if (b>50) break;
    }
        System.out.println("Angka berhenti pada jumlah angka: "+b);
    }
}
