package project;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
public class cobalagi {

    static ArrayList info = new ArrayList();
    static String buku[] = {"Skip", "Sejarah", "Dongeng", "Anak-anak", "MIPA"};
    static String judul[][] = {
        {"Skip"},
        {"Skip", "Arus Balik", "Wali Songo", "SKI"},
        {"Skip", "Kancil Pencuri Timun", "Buto Ijo", "Timus Mas"},
        {"Skip", "Tempat Tidurku Rapi", "Mengenal hewan-hewan", "Sopan Santun"},
        {"Skip", "Belajar Berhitung", "Berhitung itu Menyenangkan"}
    };
    static boolean run = true;
    static InputStreamReader input = new InputStreamReader(System.in);
    static BufferedReader jenis = new BufferedReader(input);
    static int pinjam,masuk, judull, lamaHari, denda, j = 0,detik, menit, jam, hari, bulan, tahun;
    static String kembali, nama, alamat, jaminan;
    static String[] agrs;
 protected static Calendar tambahWaktu(Date waktuPermulaan,
            int jmlTambahanWaktu, String satuan) {
    Calendar cal = Calendar.getInstance();
        cal.setTime(waktuPermulaan);
        switch (satuan) {
        case "hari":
            cal.add(Calendar.DATE, jmlTambahanWaktu);
            break;
        }
        return cal;
}
 protected static String tampilkanTanggalDanWaktu(Date tanggalDanWaktu,
            String pola, Locale lokal) {
        String tanggalStr;
        SimpleDateFormat formatter;
        if (lokal == null) {
            formatter = new SimpleDateFormat(pola);
        } else {
            formatter = new SimpleDateFormat(pola, lokal);
        }
        tanggalStr = formatter.format(tanggalDanWaktu);
        return tanggalStr;
    }
 static void jumlahWaktu ()throws IOException {
 Locale lokal = null;
        String pola = "dd/MM/yyyy HH:mm:ss:SSS";
        Date waktuPermulaan = new Date();
        int jmlTambahanWaktu = 5;
        String satuan = "hari";
 
        // Menambah hari
        Calendar cal = cobalagi.tambahWaktu(waktuPermulaan,
                jmlTambahanWaktu, satuan);
        String tanggalStr = cobalagi.tampilkanTanggalDanWaktu(
                cal.getTime(), pola, lokal);
        System.out.println("("
                + cobalagi.tampilkanTanggalDanWaktu(
                        waktuPermulaan, pola, lokal) + ") ditambah "
                + jmlTambahanWaktu + " " + satuan + " = " + tanggalStr);
 
        // Mengurangi hari
        jmlTambahanWaktu = pinjam;
        satuan = "hari";
        cal = cobalagi.tambahWaktu(waktuPermulaan,
                jmlTambahanWaktu, satuan);
        tanggalStr = cobalagi.tampilkanTanggalDanWaktu(
                cal.getTime(), pola, lokal);
        System.out.println("("
                + cobalagi.tampilkanTanggalDanWaktu(
                        waktuPermulaan, pola, lokal) + ") ditambah "
                + jmlTambahanWaktu + " " + satuan + " = " + tanggalStr);
 

 }
    static void tanggalWaktu() throws IOException {
        GregorianCalendar date = new GregorianCalendar();
        String namaBulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
detik=date.get(Calendar.SECOND);
menit=date.get(Calendar.MINUTE);
jam=date.get(Calendar.HOUR);
hari=date.get(Calendar.DAY_OF_MONTH);
bulan=date.get(Calendar.MONTH);
tahun=date.get(Calendar.YEAR);
String pola = "dd/MM/yyyy HH:mm:ss";
        System.out.println(hari+" "+namaBulan[bulan]+" "+tahun);
        System.out.println(jam+":"+menit+":"+detik);
    }

    static void data() throws IOException {
        j += 1;
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Data Diri");
        System.out.println("====================");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("Jaminan: ");
        jaminan = input.nextLine();
        for (int i = 0; i < j; i++) {
            if (i == j - 1) {
                info.add(new ArrayList());
                ((ArrayList) info.get(0)).add(nama);
                info.add(new ArrayList());
                ((ArrayList) info.get(1)).add(alamat);
                info.add(new ArrayList());
                ((ArrayList) info.get(2)).add(jaminan);
                System.out.println("Data Diri Anda");
            }
        }
        System.out.println("Nama \t\t\t\t Alamat \t\t Jaminan");
        for (int i = 0; i < j; i++) {
            if (i == j - 1) {
                System.out.println((String) ((ArrayList) info.get(0)).get(i) + " \t\t\t "
                        + ((ArrayList) info.get(1)).get(i) + " \t\t "
                        + ((ArrayList) info.get(2)).get(i));
            }
        }
        menu();
    }

    static void menu() throws IOException {
        System.out.println("====================");
        System.out.println("Pusat Buku Manca");
        System.out.println("====================");
        System.out.println("1. Sejarah");
        System.out.println("2. Dongeng");
        System.out.println("3. Anak-anak");
        System.out.println("4. MIPA");
        System.out.print("Pilih jenis buku: ");
        masuk = Integer.valueOf(jenis.readLine());
        if (masuk == 1) {
            System.out.println("Anda memilih buku " + buku[masuk]);
            lamaHari = 14;
            denda = 100000;
            System.out.println("Peminjaman paling lama adalah " + lamaHari + " hari");
            System.out.println("-----------------------------------");
        } else if (masuk == 2) {
            System.out.println("Anda memilih buku " + buku[masuk]);
            lamaHari = 3;
            denda = 30000;
            System.out.println("Peminjaman paling lama adalah " + lamaHari + " hari");
            System.out.println("-----------------------------------");
        } else if (masuk == 3) {
            System.out.println("Anda memilih buku " + buku[masuk]);
            lamaHari = 4;
            denda = 35000;
            System.out.println("Peminjaman paling lama adalah " + lamaHari + " hari");
            System.out.println("-----------------------------------");
        } else if (masuk == 4) {
            System.out.println("Anda memilih buku " + buku[masuk]);
            lamaHari = 10;
            denda = 50000;
            System.out.println("Peminjaman paling lama adalah " + lamaHari + " hari");
            System.out.println("-----------------------------------");
        }
        switch (masuk) {
            case 1:
                sejarah();
                tanya();
                break;
            case 2:
                dongeng();
                tanya();
                break;
            case 3:
                anak();
                tanya();
                break;
            case 4:
                mipa();
                tanya();
                break;
            default:
                System.out.println("Maaf, Buku Tidak Ada");
        }
        
    }
static void tanya()throws IOException {
    System.out.println("Berapa lama anda ingin meminjam?");
    pinjam=Integer.valueOf(jenis.readLine());
    System.out.println("Anda akan meminjam selama "+ pinjam+" hari");
}
    static void sejarah() throws IOException {
        System.out.println("Silahkan pilih Judul Buku: ");
        System.out.println("1. Arus Balik");
        System.out.println("2. Wali Songo");
        System.out.println("3. SKI");
        judull = Integer.valueOf(jenis.readLine());
        if (judull == 1 || judull == 2 || judull == 3) {
            System.out.println(" Anda memilih buku Berjudul " + judul[masuk][judull]);
        } else {
            System.out.println("Maaf, buku tidak ada");
        }
        
        Scanner input = new Scanner(System.in);
        int jawab;
        System.out.println("Apakah anda ingin meminjam?");
        System.out.println("1. YA | 2. TIDAK");
        jawab = input.nextInt();
        if (jawab == 1) {
            data();
        } else {
            System.out.println("TERIMA KASIH");
        }
    }

    static void dongeng() throws IOException {
        System.out.println("Silahkan pilih Judul Buku: ");
        System.out.println("1. Kancil Mencuri Timun");
        System.out.println("2. Buto Ijo");
        System.out.println("3. Timun Mas");
        judull = Integer.valueOf(jenis.readLine());
        if (judull == 1 || judull == 2 || judull == 3) {
            System.out.println(" Anda memilih buku Berjudul " + judul[masuk][judull]);
        } else {
            System.out.println("Maaf, buku tidak ada");
        }
        Scanner input = new Scanner(System.in);
        int jawab;
        System.out.println("Apakah anda ingin meminjam?");
        System.out.println("1. YA | 2. TIDAK");
        jawab = input.nextInt();
        if (jawab == 1) {
            data();
        } else {

        }
    }

    static void anak() throws IOException {
        System.out.println("Silahkan pilih Judul Buku: ");
        System.out.println("1. Tempat Tidurku Rapi");
        System.out.println("2. Mengenal hewan-hewan");
        System.out.println("3. Sopan Santun");
        judull = Integer.valueOf(jenis.readLine());
        if (judull == 1 || judull == 2 || judull == 3) {
            System.out.println(" Anda memilih buku Berjudul " + judul[masuk][judull]);
        } else {
            System.out.println("Maaf, buku tidak ada");
        }
        Scanner input = new Scanner(System.in);
        int jawab;
        System.out.println("Apakah anda ingin meminjam?");
        System.out.println("1. YA | 2. TIDAK");
        jawab = input.nextInt();
        if (jawab == 1) {
            data();
        } else {

        }
    }

    static void mipa() throws IOException {
        System.out.println("Silahkan pilih Judul Buku: ");
        System.out.println("1. Belajar Berhitung");
        System.out.println("2. Berhitung itu menyenangkan");
        judull = Integer.valueOf(jenis.readLine());
        if (judull == 1 || judull == 2) {
            System.out.println(" Anda memilih buku Berjudul " + judul[masuk][judull]);
            System.out.println("-----------------------------------");
        } else {
            System.out.println("Maaf, buku tidak ada");
        }
        Scanner input = new Scanner(System.in);
        int jawab;
        System.out.println("Apakah anda ingin meminjam?");
        System.out.println("1. YA | 2. TIDAK");
        jawab = input.nextInt();
        if (jawab == 1) {
            data();
        } else {

        }
    }

    public static void main(String[] args) throws IOException {
tanggalWaktu();
        data();

    }
}
