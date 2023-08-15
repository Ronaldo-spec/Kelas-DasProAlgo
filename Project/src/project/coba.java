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

public class coba {

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
    static int pinjam, masuk, judull, lamaHari, j = 2, c = 0, detik, menit, jam, hari, bulan, tahun, jawab, pilih, tambahWaktu, lama;
    static String kembali, nama, alamat, jaminan, data, pinjaman;
    static String[] agrs;

    static void tanggalWaktu() throws IOException {
        GregorianCalendar date = new GregorianCalendar();
        String namaBulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam = date.get(Calendar.HOUR);
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        System.out.println(hari + " " + namaBulan[bulan] + " " + tahun);
        System.out.println(jam + ":" + menit + ":" + detik);
    }

    static void daftar() throws IOException {
        System.out.println("1. Tampilkan Data");
        System.out.println("2. Mencari Data");
        System.out.println("3. Masukkan Data");
        System.out.println("4. Edit Data");
        System.out.println("5. Hapus Data");
        System.out.println("6. Perpanjangan");
        System.out.println("7. Selesai");
        System.out.println("Pilih: ");
        pilih = Integer.valueOf(jenis.readLine());
        System.out.println("======================================================================================");
        switch (pilih) {
            case 1:
                tampilData();
                daftar();
                break;
            case 2:
                pencarian();
                daftar();
                break;
            case 3:
                j += 1;
                masukData();
                menu();
                daftar();
                break;
            case 4:
                editData();
                daftar();
                break;
            case 5:
                hapusData();
                daftar();
                break;
            case 6:
                perpanjangan();
                daftar();
            default:
                System.out.println("Terima Kasih");
        }
    }

    static void tampilData() throws IOException {
        for (int i = 0; i < j; i++) {
            if (i == j - 1) {
                info.add(new ArrayList());
                ((ArrayList) info.get(0)).add(nama);
                info.add(new ArrayList());
                ((ArrayList) info.get(1)).add(alamat);
                info.add(new ArrayList());
                ((ArrayList) info.get(2)).add(jaminan);
                info.add(new ArrayList());
                ((ArrayList) info.get(3)).add(pinjaman);
                System.out.println("\t\t\t\t\tDATA DIRI ANDA");
            }
        }
        System.out.println("NAMA \t\t\t ALAMAT \t\t JAMINAN\t\t\tPINJAMAN");
        for (int i = 0; i < j; i++) {
            System.out.println((String) ((ArrayList) info.get(0)).get(i) + " \t\t\t "
                    + ((ArrayList) info.get(1)).get(i) + " \t\t "
                    + ((ArrayList) info.get(2)).get(i) + " \t\t\t\t" + ((ArrayList) info.get(3)).get(i));

        }
        System.out.println("======================================================================================");
    }

    static void masukData() throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Data Diri");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("Jaminan: ");
        jaminan = input.nextLine();
    }

    static void pencarian() throws IOException {
        tampilData();
        String tampung;
        System.out.println("Masukkan nama yang dicari: ");
        data = jenis.readLine();
        for (int i = 0; i < j; i++) {
            tampung = (String) ((ArrayList) info.get(0)).get(i);
            if (tampung.equalsIgnoreCase(data)) {
                c = i;
                System.out.println("DATA ADA");
                break;

            } else {
                c = -1;
            }
        }
        if (c == -1) {
            System.out.println("DATA KOSONG");
        }
    }

    static void editData() throws IOException {
        Scanner input = new Scanner(System.in);
        tampilData();
        String tampung;
                System.out.println("Masukkan nama yang diganti: ");
                data = jenis.readLine();
                for (int i = 0; i < j; i++) {
                    tampung = (String) ((ArrayList) info.get(0)).get(i);
                    if (tampung.equalsIgnoreCase(data)) {
                        c = i;
                        break;

                    } else {
                        c = -1;
                    }
                }
                if (c == -1) {
                    System.out.println("DATA KOSONG");
                }
                System.out.println("Nama Baru: ");
                String namaBaru = jenis.readLine();
                ((ArrayList) info.get(0)).set(c, namaBaru);
                System.out.println("Alamat baru: ");
                String alamatBaru = jenis.readLine();
                ((ArrayList)info.get(1)).set(c, alamatBaru);
                System.out.println("Jaminan lain: ");
                String jaminanBaru = jenis.readLine();
                ((ArrayList)info.get(2)).set(c, jaminanBaru);
        

    }

    static void hapusData() throws IOException {
        tampilData();
        String tampung;
        System.out.println("Masukkan nama yang dihapus");
        data = jenis.readLine();
        for (int i = 0; i < j; i++) {
            tampung = (String) ((ArrayList) info.get(0)).get(i);
            if (tampung.equalsIgnoreCase(data)) {
                c = i;
                break;
            } else {
                c = -1;
            }
        }
        if (c == -1) {
            System.out.println("DATA KOSONG");
            daftar();
        }
        ((ArrayList) info.get(0)).remove(c);
        ((ArrayList) info.get(1)).remove(c);
        ((ArrayList) info.get(2)).remove(c);
        j -= 1;
    }

    static void tanya() throws IOException {
        Scanner sc = new Scanner(System.in);
        Locale lokal = null;
        String pola = "dd/MM/yyyy";
        Date waktuPermulaan = new Date();
        String satuan = "hari";

        System.out.print("Lamanya Meminjam: ");
        pinjam = sc.nextInt();
        Calendar cal = coba.tambahWaktu(waktuPermulaan,
                pinjam, satuan);
        String tanggalStr = coba.tampilkanTanggalDanWaktu(
                cal.getTime(), pola, lokal);
        System.out.println("("
                + coba.tampilkanTanggalDanWaktu(
                        waktuPermulaan, pola, lokal) + ") Lamanya Anda Menyewa Menjadi "
                + pinjam + " " + satuan);
        System.out.println("Anda harus mengembalikan pada (" + tanggalStr + ")");

    }

    static void perpanjangan() throws IOException {
        Scanner sc = new Scanner(System.in);
        Locale lokal = null;
        String pola = "dd/MM/yyyy";
        Date waktuMula = new Date();
        String satuan = "hari";
        System.out.print("Lamanya memperpanjang waktu sewa : ");
        tambahWaktu = sc.nextInt();
        System.out.println("__________________________");
        lama = pinjam + tambahWaktu;
        Calendar cal = coba.tambahWaktu(waktuMula,
                lama, satuan);
        String tanggalStr = coba.tampilkanTanggalDanWaktu(
                cal.getTime(), pola, lokal);
        System.out.println("__________________________");
        System.out.println("("
                + coba.tampilkanTanggalDanWaktu(
                        waktuMula, pola, lokal) + ") Lamanya Anda Menyewa "
                + lama + " " + satuan);
        System.out.println("Anda harus mengembalikan pada (" + (tanggalStr + tambahWaktu) + ")");
        System.out.println("__________________________");
    }

    static void menu() throws IOException {
        System.out.println("======================================================================================");
        System.out.println("\t\t\t\t   Pusat Buku Manca");
        System.out.println("\t\t\t\tJL. Kembang Turi no.1");
        System.out.println("\t\t\t\tLOWOKWARU, KOTA MALANG");
        System.out.println("======================================================================================");
        System.out.println("1. Sejarah");
        System.out.println("2. Dongeng");
        System.out.println("3. Anak-anak");
        System.out.println("4. MIPA");
        System.out.print("Pilih jenis buku: ");
        masuk = Integer.valueOf(jenis.readLine());
        if (masuk == 1) {
            pinjaman = "Sejarah";
            System.out.println("Anda memilih buku " + buku[masuk]);
            lamaHari = 14;
            System.out.println("Peminjaman paling lama adalah " + lamaHari + " hari");
            System.out.println("-----------------------------------");
        } else if (masuk == 2) {
            pinjaman = "Dongeng";
            System.out.println("Anda memilih buku " + buku[masuk]);
            lamaHari = 3;
            System.out.println("Peminjaman paling lama adalah " + lamaHari + " hari");
            System.out.println("-----------------------------------");
        } else if (masuk == 3) {
            pinjaman = "Anak-Anak";
            System.out.println("Anda memilih buku " + buku[masuk]);
            lamaHari = 4;
            System.out.println("Peminjaman paling lama adalah " + lamaHari + " hari");
            System.out.println("-----------------------------------");
        } else if (masuk == 4) {
            pinjaman = "MIPA";
            System.out.println("Anda memilih buku " + buku[masuk]);
            lamaHari = 10;
            System.out.println("Peminjaman paling lama adalah " + lamaHari + " hari");
            System.out.println("-----------------------------------");
        }
        switch (masuk) {
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
        judull = Integer.valueOf(jenis.readLine());
        if (judull == 1 || judull == 2 || judull == 3) {
            System.out.println(" Anda memilih buku Berjudul " + judul[masuk][judull]);
            System.out.println("-----------------------------------");
            tanya();
        } else {
            System.out.println("Maaf, buku tidak ada");
        }

        Scanner input = new Scanner(System.in);
        int jawab;
        System.out.println("Apakah anda ingin retry?");
        System.out.println("1. YA | 2. TIDAK");
        jawab = input.nextInt();
         switch (jawab) {
            case 1:
                daftar();
            default:
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
            System.out.println("-----------------------------------");
            tanya();
        } else {
            System.out.println("Maaf, buku tidak ada");
        }
        Scanner input = new Scanner(System.in);
        int jawab;
        System.out.println("Apakah anda ingin retry?");
        System.out.println("1. YA | 2. TIDAK");
        jawab = input.nextInt();
         switch (jawab) {
            case 1:
                daftar();
            default:
                System.out.println("TERIMA KASIH");
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
            System.out.println("-----------------------------------");
            tanya();
        } else {
            System.out.println("Maaf, buku tidak ada");
        }
        Scanner input = new Scanner(System.in);
        int jawab;
        System.out.println("Apakah anda ingin retry?");
        System.out.println("1. YA | 2. TIDAK");
        jawab = input.nextInt();
        switch (jawab) {
            case 1:
                daftar();
            default:
                System.out.println("TERIMA KASIH");
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
            tanya();
        } else {
            System.out.println("Maaf, buku tidak ada");
        }
        Scanner input = new Scanner(System.in);
        int jawab;
        System.out.println("Apakah anda ingin retry?");
        System.out.println("1. YA | 2. TIDAK");
        jawab = input.nextInt();
        switch (jawab) {
            case 1:
                daftar();
            default:
                System.out.println("TERIMA KASIH");
        }
    }

    public static void main(String[] args) throws IOException {

        String nilai[][] = new String[2][4];
        nilai[0][0] = "Dobleh";
        nilai[0][1] = "Politeknik";
        nilai[0][2] = "KTM";
        nilai[0][3] = "Sejarah";
        nilai[1][0] = "Jamal";
        nilai[1][1] = "Malang";
        nilai[1][2] = "KTP";
        nilai[1][3] = "Dongeng";

        for (int v = 0; v < j; v++) {
            info.add(new ArrayList());
            ((ArrayList) info.get(0)).add(nilai[v][0]);
            info.add(new ArrayList());
            ((ArrayList) info.get(1)).add(nilai[v][1]);
            info.add(new ArrayList());
            ((ArrayList) info.get(2)).add(nilai[v][2]);
            info.add(new ArrayList());
            ((ArrayList) info.get(3)).add(nilai[v][3]);
        }
        daftar();
    }
}
