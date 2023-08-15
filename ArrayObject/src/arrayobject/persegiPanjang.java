package arrayobject;
import java.util.Scanner;
public class persegiPanjang {

    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        persegiPanjang[] ppArray = new persegiPanjang[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            ppArray[0]=new persegiPanjang();
            System.out.println("Persegi Panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[0].panjang=input.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[0].lebar=input.nextInt();
        }
        for (int i = 0; i < 3; i++) {
        System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[0].panjang+", lebar: "+ppArray[0].lebar);
        }
    }
}
