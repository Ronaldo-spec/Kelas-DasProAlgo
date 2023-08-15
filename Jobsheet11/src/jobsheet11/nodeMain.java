
package jobsheet11;
import java.util.Scanner;
public class nodeMain {
    
    static nodeList data = new nodeList();
    static Scanner ronaldo = new Scanner(System.in);
    static void print(){
        System.out.println("---Daftar----");
        System.out.println("1. Head");
        System.out.println("2. Rear");
        System.out.println("3. Tampilkan data urutan");
        int pilih = ronaldo.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Data terdepan");
                try {
                    data.getFirst();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            break;
            case 2:
                System.out.println("Data paling belakang");
                try {
                    data.getLast();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            break;
            case 3:
                System.out.print("Masukkan nomor urutan: ");
                int urutan = ronaldo.nextInt();
                try {
                    data.get(urutan-1);//karena indeks dimulai dari 0
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            break;
            case 4:
                data.print();
                break;
            
        }
    }
    static void delete(){
        System.out.println("---Daftar---");
        System.out.println("1. Hapus sesuai urutan");
        System.out.println("2. Hapus urutan tertentu");
        System.out.println("3. Hapus nama tertentu");
        System.out.println("4. Format");
        int pilih = ronaldo.nextInt();  
        switch(pilih){
            case 1:
                data.removeFirst();
                data.print();
                break;
            case 2:
                System.out.print("Nomor urutan ke ");
                int urutan = ronaldo.nextInt();
                try {
                    data.remove(urutan-1);
                    data.print();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            break;
            case 3:
                System.out.print("Masukkan nama: ");
                String nama=ronaldo.next();
                try {
                    data.removeByValue(nama);
                    data.print();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            break;
            case 4:
                data.clear();
                data.print();
                break;
        }
    }
    
    public static void main(String[] args) {
        boolean ulang = true;
        while (ulang){
            System.out.println("---Data Pesanan---");
            System.out.println("1. Masukkan Pesanan");
            System.out.println("2. Hapus Pesanan");
            System.out.println("3. Tampilkan Pesanan");
            System.out.println("4. Tampilkan jumlah menu pesanan yang sama");
            System.out.println("5. Exit");
            int pilih = ronaldo.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int antri = ronaldo.nextInt();
                    System.out.print("Nama Pelanggan: ");
                    String nama = ronaldo.next();
                    System.out.print("Pesanan: ");
                    String pesanan = ronaldo.next();
                    System.out.println("Anda mendapatkan nomor antrian ke-"+antri);
                    try {
                    data.addByByValue(nama, pesanan,antri);
                    data.print();
                } catch (Exception e){
                    System.out.println(e.getMessage());
                       
                }
            break;
                case 2:
                    delete();
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    data.ulang();
                case 5:
                    ulang = false;
                    break;
                    
            }
        }
    }
}
