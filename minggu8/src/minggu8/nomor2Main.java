
package minggu8;
import java.util.Scanner;
public class nomor2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        nomor2 sc = new nomor2(5);
        String data[];
        System.out.println("Masukkan jumlah data: ");
        int banyak = input.nextInt();
        data=new String[banyak];
        int x=0;
        while(x<data.length){
            System.out.println("Masukkan Data: ");
            data[x]=input1.nextLine();
            sc.push(data[x]);
            x++;
        }
        sc.print();;
    }
}
