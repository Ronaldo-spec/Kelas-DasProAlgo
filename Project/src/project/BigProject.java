package project;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BigProject {
static boolean run = true;
static InputStreamReader input = new InputStreamReader(System.in);
static BufferedReader jenis = new BufferedReader(input);
    static void menu() throws IOException{
        int masuk;
        String buku[] = {"Skip", "Sejarah", "Dongeng", "Anak-anak", "MIPA"};
        String judul[][] = {
            {"Skip"},
            {"Skip", "Arus Balik", "Wali Songo", "SKI"},
            {"Skip", "Kancil Pencuri Timun", "Buto Ijo", "Timus Mas"},
            {"Skip", "Tempat Tidurku Rapi", "Mengenal hewan-hewan", "Sopan Santun"},
            {"Skip", "Belajar Berhitung", "Berhitung itu Menyenangkan"}
        };
        System.out.println("====================");
        System.out.println("Pusat Buku Manca");
        System.out.println("====================");
        System.out.println("1. Sejarah");
        System.out.println("2. Dongeng");
        System.out.println("3. Anak-anak");
        System.out.println("4. MIPA");
        System.out.print("Pilih jenis buku: ");
        masuk = Integer.valueOf(jenis.readLine());
         if (masuk == 1 || masuk == 2 || masuk == 3 || masuk == 4) {
            System.out.println("Anda memilih buku " + buku[masuk]);
            System.out.println("-------------------------");
    }
         switch(masuk) {
             case 1:
                 sejarah();
                 break;
             case 2:
                 dongeng();
                 break;
             case 3:
                 anak();
                 break;
             case 4:
                 mipa();
                 break;
             default:
                 System.out.println("Maaf, Buku Tidak Ada");
    }
    }
static void sejarah() throws IOException {
    System.out.println("Silahkan pilih Judul Buku: ");
                    System.out.println("1. Arus Balik");
                    System.out.println("2. Wali Songo");
                    System.out.println("3. SKI");
                    int judull= Integer.valueOf(jenis.readLine());
                    System.out.println(" Anda memilih buku Berjudul " + judul[masuk][judull]);
}

static void dongeng () throws IOException {
    System.out.println("Silahkan pilih Judul Buku: ");
                    System.out.println("1. Kancil Mencuri Timun");
                    System.out.println("2. Buto Ijo");
                    System.out.println("3. Timun Mas");
                   int judull= Integer.valueOf(jenis.readLine());
}
static void anak () throws IOException{
    System.out.println("Silahkan pilih Judul Buku: ");
                    System.out.println("1. Tempat Tidurku Rapi");
                    System.out.println("2. Mengenal hewan-hewan");
                    System.out.println("3. Sopan Santun");
                   int judull= Integer.valueOf(jenis.readLine());
}
static void mipa () throws IOException{
    System.out.println("Silahkan pilih Judul Buku: ");
                    System.out.println("1. Belajar Berhitung");
                    System.out.println("2. Berhitung itu menyenangkan");
                    int judull= Integer.valueOf(jenis.readLine());
}
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
       
menu();

    }
}
