package perulangan2;
import java.util.Scanner;
import java.util.Random;
public class Quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.println(number+"");
                System.out.println("Tebak angka (1-10):");
                int answer = input.nextInt();
                input.nextLine();
                if (answer<number) {
                    System.out.println("Tebakan anda lebih kecil dari jawabn");
                } else if (answer>number) {
                    System.out.println("Jawaban anda terlalu besar");
                }
                success = (answer == number);
            } while (!success);
            System.out.println("Apakah anda ingin mengulang permainan? (Y/T)?");
            menu = input.findInLine(".").charAt(0);
            input.nextLine();
        } while (menu == 'y' || menu == 'Y');

    }

}
