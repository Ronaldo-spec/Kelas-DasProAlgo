
package tugas29;

import java.util.Scanner;
public class persewaan {
    Scanner input = new Scanner(System.in);
    int noID,total,lamaPinjam,hargaSewa;
    String nama,data,game;
    persewaan(){
        
    }
    persewaan(int nomor,int lama,String nm,String gm){
        noID=nomor;
        nama=nama;
        game=gm;
        lamaPinjam=lama;
    }
    void tampilBarang(){
        System.out.println("Nama        : "+nama);
        System.out.println("Nomor ID    : "+noID);
        System.out.println("Nama Game   : "+game);
        System.out.println("Lama Pinjam : "+lamaPinjam);
        
    }
   void bayar(){
       System.out.println("Harga Sewa/hari: ");
        hargaSewa = input.nextInt();
       total=lamaPinjam*hargaSewa;
       System.out.print("Total Tagihan: Rp "+total);
   }
    }
    
    
    

