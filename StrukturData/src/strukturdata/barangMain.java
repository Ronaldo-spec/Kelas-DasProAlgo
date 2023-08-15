
package strukturdata;

public class barangMain {
    public static void main(String[] args) {
        Barang bl = new Barang();
        bl.namaBarang = "Corsair 2 GB";
        bl.jenisBarang = "DDR";
        bl.hargaSatuan = 250000;
        bl.stok = 10;
        bl.tambahStok(1);
        bl.kurangiStok(3);
        bl.tampilBarang();
        int hargaTotal=bl.hitungHargaTotal(4);
        System.out.println("Harga 4 buah: "+hargaTotal);
        Barang b2 = new Barang("Logitech","Wireless Mouse",25,150000);
        b2.tampilBarang();
        Barang b3 = new Barang("Nemesis Fan","Nemesis Cooler",10,155000);
        b3.tampilBarang();
    }
    
}
