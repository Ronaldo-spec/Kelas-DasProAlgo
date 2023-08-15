
package tugas29;

public class Barang {
    String namaBarang;
    int hargaSatuan, jumlah,total,diskon,hargaDiskon,bayar;
    Barang(){
        
    }
    Barang (String nb,int hs,int jum){
        namaBarang=nb;
        hargaSatuan=hs;
        jumlah=jum;
    }
    void tampilBarang(){
        System.out.println("Nama   : "+namaBarang);
        System.out.println("Harga  : Rp "+hargaSatuan);
        System.out.println("Jumlah : "+jumlah);
        
    }
    void hitungTotal(){
        total=jumlah*hargaSatuan;
        System.out.println("Totalnya adalah: Rp "+total);
    }
    void hitungDiskon(){
        if (total>100000) {
            System.out.println("Anda mendapatkan diskon sebesar 10%");
            diskon=((total*10)/100);
            hargaDiskon=total-diskon;
            System.out.println("Harganya menjadi: Rp "+hargaDiskon);
        }else if (total>=50000&&total<=100000){
            System.out.println("Anda mendapatkan diskon sebesar 5%");
            diskon=((total*5)/100);
            hargaDiskon=total-diskon;
            System.out.println("Harganya menjadi: Rp "+hargaDiskon);
        } else if (total<50000){
            System.out.println("Maaf, anda tidak mendapatkan diskon");
        }
    }
    void hitungBayar(){
        jumlah+=hargaDiskon;
    }
}
