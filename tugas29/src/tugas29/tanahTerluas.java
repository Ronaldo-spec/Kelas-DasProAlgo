
package tugas29;
import java.util.Scanner;
public class tanahTerluas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int atas=0,bawah=0;
        System.out.print("Masukkan Jumlah tanah: ");
        int jumlah=input.nextInt();
        tanahluas[] tanah =new tanahluas[jumlah];
        for (int i = 0; i < tanah.length; i++) {
            tanah[i]=new tanahluas();
        }
        for (int i = 0; i < tanah.length; i++) {
            System.out.println("Tanah ke-"+i);
            System.out.print("Masukkan panjang: ");
           tanah[i].panjang=input.nextInt();
            System.out.print("Masukkan lebar: ");
            tanah[i].lebar=input.nextInt();
        }
        for (int i = 0; i < tanah.length; i++) {
            System.out.println("Luas Tanah ke-"+i+" : "+tanah[i].luasTanah());
        }
        for (int i = 0; i < tanah.length; i++) {
            if (tanah[i].luasTanah()>atas) {
                atas=tanah[i].luasTanah();
                
               
            }
            
        }
       
        }
    }



