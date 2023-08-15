
package tugas29;
import java.util.Scanner;
public class lingkaranMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        lingkaran lg = new lingkaran();
        System.out.print("Masukkan diameter: ");
        lg.diameter=input.nextDouble();
        System.out.print("Jari-jarinya adalah: "+lg.jariJari());
        System.out.println("");
        System.out.print("Luasnya adalah: "+lg.hitungLuas());
        System.out.println("");
        System.out.print("Kelilingnya adalah: "+lg.hitungKeliling());
        
        
}
}
