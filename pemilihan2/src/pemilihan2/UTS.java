package pemilihan2;

import java.util.Scanner;

public class UTS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jati, pinus, meranti, harga, jumlah1, jenis1, ongkir, metode, bank, biayatf, pembayaran;
        System.out.println("Kayu yang tersedia: ");
        System.out.println("1. Kayu Jati");
        System.out.println("2. Kayu Pinus");
        System.out.println("3. Kayu Meranti");
        System.out.println("Pilih jenis kayu: ");
        jenis1 = input.nextInt();
        switch (jenis1) {
            case 1:
                System.out.println("Anda memilih kayu nomor " + jenis1);
                jati = 300000;
                ongkir = 1000000;
                System.out.println("Harga kayu jati tersebut adalah: Rp." + jati + ("/batang"));
                System.out.println("Biaya ongkirnya adalah: Rp." + ongkir);
                System.out.println("Silahkan masukkan jumlah pesanan anda: ");
                jumlah1 = input.nextInt();
                harga = jati * jumlah1 + ongkir;
                System.out.println("Total harganya adalah: Rp." + harga);
                System.out.println("Silahkan pilih jenis pembayaran: ");
                System.out.println("1. Transfer");
                System.out.println("2. Tunai");
                metode = input.nextInt();
                switch (metode) {
                    case 1:
                        System.out.println("Pilih jenis Bank");
                        System.out.println("1. Bank BCA");
                        System.out.println("2. Bank BNI");
                        System.out.println("3. Bank BRI");
                        bank = input.nextInt();
                        switch (bank) {
                            case 1:
                                System.out.println("Anda memilih bank BCA");
                                biayatf = 5000;
                                System.out.println("Biaya Transfernya adalah: Rp." + biayatf);
                                pembayaran = harga + biayatf;
                                System.out.println("Total pembayaran anda adalah: Rp" + pembayaran);
                            case 2:
                                System.out.println("Anda memilih bank BNI");
                                biayatf = 10000;
                                System.out.println("Biaya Transfernya adalah: Rp." + biayatf);
                                pembayaran = harga + biayatf;
                                System.out.println("Total pembayaran anda adalah: Rp" + pembayaran);
                            case 3:
                                System.out.println("Anda memilih bank BRI");
                                biayatf = 15000;
                                System.out.println("Biaya Transfernya adalah: Rp." + biayatf);
                                pembayaran = harga + biayatf;
                                System.out.println("Total pembayaran anda adalah: Rp" + pembayaran);
                                break;
                    case 2:
                        System.out.println("Anda tidak mendapatkan potongan ");
                        }
                        break;
              case 2:
                        System.out.println("Anda memilih kayu nomor " + jenis1);
                        pinus = 250000;
                        ongkir = 800000;
                        System.out.println("Harga kayu pinus tersebut adalah: Rp." + pinus + ("/batang"));
                        System.out.println("Biaya ongkirnya adalah: Rp." + ongkir);
                        System.out.println("SIlahkan masukkan jumlah pesanan anda");
                        jumlah1 = input.nextInt();
                        harga = pinus * jumlah1 + ongkir;
                        System.out.println("Total harganya adalah: Rp." + harga);
                        System.out.println("Silahkan pilih jenis pembayaran: ");
                        System.out.println("1. Transfer");
                        System.out.println("2. Tunai");
                        metode = input.nextInt();
                        switch (metode) {
                            case 1:
                                System.out.println("Pilih jenis Bank");
                                System.out.println("1. Bank BCA");
                                System.out.println("2. Bank BNI");
                                System.out.println("3. Bank BRI");
                                bank = input.nextInt();
                                switch (bank) {
                                    case 1:
                                        System.out.println("Anda memilih bank BCA");
                                        biayatf = 5000;
                                        System.out.println("Biaya Transfernya adalah: Rp." + biayatf);
                                        pembayaran = harga + biayatf;
                                        System.out.println("Total pembayaran anda adalah: Rp" + pembayaran);
                                    case 2:
                                        System.out.println("Anda memilih bank BNI");
                                        biayatf = 10000;
                                        System.out.println("Biaya Transfernya adalah: Rp." + biayatf);
                                        pembayaran = harga + biayatf;
                                        System.out.println("Total pembayaran anda adalah: Rp" + pembayaran);
                                    case 3:
                                        System.out.println("Anda memilih bank BRI");
                                        biayatf = 15000;
                                        System.out.println("Biaya Transfernya adalah: Rp." + biayatf);
                                        pembayaran = harga + biayatf;
                                        System.out.println("Total pembayaran anda adalah: Rp" + pembayaran);
                                }
                                break;
                            case 3:
                                System.out.println("Anda memilih kayu nomor " + jenis1);
                                meranti = 200000;
                                ongkir = 500000;
                                System.out.println("Harga kayu meranti tersebut adalah: Rp." + meranti + ("/batang"));
                                System.out.println("Biaya ongkirnya adalah: Rp." + ongkir);
                                System.out.println("SIlahkan masukkan jumlah pesanan anda");
                                jumlah1 = input.nextInt();
                                harga = meranti * jumlah1 + ongkir;
                                System.out.println("Total harganya adalah: Rp." + harga);
                                System.out.println("Silahkan pilih jenis pembayaran: ");
                                System.out.println("1. Transfer");
                                System.out.println("2. Tunai");
                                metode = input.nextInt();
                                switch (metode) {
                                    case 1:
                                        System.out.println("Pilih jenis Bank");
                                        System.out.println("1. Bank BCA");
                                        System.out.println("2. Bank BNI");
                                        System.out.println("3. Bank BRI");
                                        bank = input.nextInt();
                                        switch (bank) {
                                            case 1:
                                                System.out.println("Anda memilih bank BCA");
                                                biayatf = 5000;
                                                System.out.println("Biaya Transfernya adalah: Rp." + biayatf);
                                                pembayaran = harga + biayatf;
                                                System.out.println("Total pembayaran anda adalah: Rp" + pembayaran);
                                            case 2:
                                                System.out.println("Anda memilih bank BNI");
                                                biayatf = 10000;
                                                System.out.println("Biaya Transfernya adalah: Rp." + biayatf);
                                                pembayaran = harga + biayatf;
                                                System.out.println("Total pembayaran anda adalah: Rp" + pembayaran);
                                            case 3:
                                                System.out.println("Anda memilih bank BRI");
                                                biayatf = 15000;
                                                System.out.println("Biaya Transfernya adalah: Rp." + biayatf);
                                                pembayaran = harga + biayatf;
                                                System.out.println("Total pembayaran anda adalah: Rp" + pembayaran);
                                        }
                                        break;
                                }
                        }
                }
        }
    }
}