
package array;
import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] grade = {"A","B+", "B", "C+", "D"};
        double[] angka = {4, 3.5, 3, 2.5, 2, 1};
        double nilai=0,rata;
        System.out.println("Masukkan mata kuliah yang diikuti: ");
        int mapel = input.nextInt();
        String[] matkul = new String[mapel];
        for (int i = 0; i < matkul.length; i++) {
            System.out.println("Masukkan mata kuliah: ");
            matkul[i]=input.nextLine();
        }
        for (String i : matkul) {
            System.out.println("Masukkan bobot SKS"+i+" :");
            double bobot = input.nextDouble();
            System.out.println("Masukkan nilai "+i+" A,B+,C+,C,D");
            String score = input.nextLine();
            for (int j = 0; j < ; j++) {
                
            }
        }
    }
}
