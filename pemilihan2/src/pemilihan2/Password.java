package pemilihan2;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        System.out.println("Masukkan Username: ");
        username = input.nextLine();

        if (username.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Password: ");
            password = input.nextLine();
            if (password.equals("RAHAsia123")) {
                System.out.println("Anda Berhasil Login");

            } else {
             System.out.println("Password anda salah");}

        } else {
         System.out.println("username salah"); }

    }
}
