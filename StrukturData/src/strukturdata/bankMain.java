
package strukturdata;
import java.util.Scanner;
public class bankMain {
    public static void menu(){
         System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
      int pilih;
      String cari;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian: ");
        int jml=input.nextInt();
        bank sc = new bank(jml);
        do {
            menu();
            pilih = input.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan No. Rekening: ");
                    String rek = input.next();
                    System.out.print("Masukkan nama nasabah: ");
                    String nama = input.next();
                    sc.enqueue(rek, nama);
                    break;
                case 2:
                    String dataOut = sc.dequeue();
                    if (!dataOut.equals("kosong")) {
                        System.out.println("Data yang dikeluarkan: "+dataOut);
                        break;
                    }
                case 3:
                    sc.print();
                    break;
                case 4:
                    sc.peek();
                    break;
                case 5:
                    sc.peekRear();;
                    break;
                case 6:
                    System.out.println("Masukkan No.Rek yang dicari: ");
                    cari=input.next();
                    sc.peekPosition(cari);
                    break;
                case 7:
                    System.out.println("Masukkan data dalam antrian: ");
                    int cari1=input.nextInt();
                    sc.peekAt(cari1);
                    break;
            }
        }
        while (pilih == 1||pilih==2||pilih==3||pilih==4||pilih==5||pilih==6||pilih==7);
    }
}   
    
