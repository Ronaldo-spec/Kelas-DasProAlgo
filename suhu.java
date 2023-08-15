import java.util.Scanner;
public class suhu {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai suhu dalam celcius = ");
        Float input = userInput.nextFloat();
        System.out.println("reamur\t\t\t = " + input * 4/5);
        System.out.println("fahrenheit\t\t = " + (input * 9/5 + 32));
        System.out.println("kelvin\t\t\t = " + (input + 273));
    }
}