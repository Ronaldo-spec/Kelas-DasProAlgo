import java.util.scanner
public class tugas {
    public static void main(String[] args) {
        Scanner userInput = new scanner (System.in);
        System.out.print("Gaji pokok: ");
        Float input = userInput.nextFloat();
        System.out.println("Gaji kena pajak: " + input * 10%);
    }
}