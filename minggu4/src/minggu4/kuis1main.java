
package minggu4;
import java.util.Scanner;
public class kuis1main {
    public static void main(String[] args) {
        int jumlah,pilih,angka,c=0,jawab;
        double akhir,total=0;
        boolean ulang=true;
        Scanner input = new Scanner(System.in);
        kuis1 sc = new kuis1();
       while(ulang) {
        System.out.println("Masukkan jumlah array: ");
        jumlah=input.nextInt();
        kuis1[]array=new kuis1[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            array[i]=new kuis1();
            System.out.println("Masukkan nilai ke-"+i);
            array[i].nilai=input.nextInt();
        }
         
        System.out.println("Pilih Menu: ");
        System.out.println("1. Mean");
        System.out.println("2. Median");
        System.out.println("3. Modus");
        System.out.println("4. Hitung kemunculan tertentu");
          
        pilih=input.nextInt();
         
        switch(pilih){
            case 1:
                for (int i = 0; i <jumlah ; i++) {
                    total+=array[i].nilai;
                }
                akhir=total/jumlah;
                System.out.println("Nilai Mean-nya adalah "+akhir);
                break;
            case 2:
               break;
            case 3:
                break;
            case 4:
                System.out.println("Masukkan angka: ");
                angka=input.nextInt();
                for (int i = 0; i < jumlah; i++) {
                    if (array[i].nilai==(angka)) {
                        c++;
                }     
                }
                System.out.println("Angka "+angka+" muncul "+c+" kali");
                break;
        }
         
        System.out.println("Apa anda ingin mengulangi lagi?");
                System.out.println("1. YA");
                System.out.println("2. Tidak");
                jawab=input.nextInt();
                if (jawab==2) {
                    ulang=false;
                }
         }
    }
}
