
package algoritma;
import java.util.Scanner;
public class lluas {
    static Scanner input = new Scanner(System.in);
    static double alas,tinggi,sisi,jari,luas;
    static int menu,jawab;
    static void menu(){
        System.out.println("Pilih Opsi: ");
        System.out.println("1. Menghitung Luas Segitiga");
        System.out.println("2. Menghitung luas segiempat");
        System.out.println("3. Menghitung luas lingkaran");
        menu=input.nextInt();
        switch (menu){
            case 1:
                segitiga();
                tawar();
                break;
            case 2:
                segiempat();
                tawar();
                break;
            case 3:
                lingkaran();
                tawar();
                break;
        }
        
    }
    static void segitiga(){
        System.out.print("Masukkan alas segitiga: ");
        alas=input.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi=input.nextDouble();
        luas=alas*tinggi/2;
        System.out.print("Luas segitiganya adalah: "+luas);
        System.out.println("");
    }
    static void segiempat(){
        System.out.print("Masukkan panjang sisi: ");
        sisi=input.nextDouble();
        luas=sisi*sisi;
        System.out.print("Luas segiempatnya adalah "+luas);
        System.out.println("");
    }
    static void lingkaran(){
        System.out.print("masukkan jari-jari lingkaran: ");
        jari=input.nextDouble();
        luas=2*3.14*jari;
        System.out.print("Luas lingkarannya adalah: "+luas);
        System.out.println("");
    }
    static void tawar (){
        System.out.println("Apa anda menghitung lagi?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        jawab=input.nextInt();
        switch (jawab){
            case 1:
                menu();
                break;
            case 2:
                System.out.println("Terima Kasih");
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
