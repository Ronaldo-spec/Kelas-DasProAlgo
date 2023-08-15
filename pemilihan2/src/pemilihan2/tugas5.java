package pemilihan2;

import java.util.Scanner;

public class tugas5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, total, jumlah, jenis, ongkir, pembayaran, bayar;
        System.out.println("Macam Jenis kayu");
        System.out.println("1. Pinus");
        System.out.println("2. Jati");
        System.out.println("3. Meranti");
        System.out.println("Kayu pilihan: ");
        jenis = input.nextInt();
        System.out.println("Harga Kayu/batang: ");
        harga = input.nextInt();
        System.out.println("Jumlah pesanan: ");
        jumlah = input.nextInt();
        if (jenis == 1) {
            System.out.println("Biaya kirimnya adalah Rp.1000000");
            ongkir = 4000000;
            if (jumlah >= 15) {
                System.out.println("Anda mendapatkan potongan ongkir sebesar Rp.500000");
                total = (harga * jumlah) + (ongkir - 500000);
                System.out.println("Total biaya: Rp." + total);
            } else {

                System.out.println("Anda belum mendapatkan potongan");
                total = harga*jumlah+ongkir;
                System.out.println("Total biaya: Rp." + total);
            }
        } else if (jenis == 2) {
            System.out.println("Biaya kirimnya adalah Rp. 250000 ");
            ongkir = 5000000;
            if (jumlah >= 10) {
                System.out.println("Anda mendapatkan potongan ongkir sebesar 2000000");
                total = (harga * jumlah) + (ongkir -2000000 );
                System.out.println("Total Biaya: Rp." + total);
            } else {

                System.out.println("Anda belum mendapatkan potongan");
                total = harga *jumlah+ ongkir;
                System.out.println("Total biaya: Rp." + total);
            }
        } else {
            System.out.println("Biaya kirimnya adalah Rp. 1500000");
            ongkir = 1500000;
            if (jumlah >= 10) {
                System.out.println("Anda mendapatkan potongan ongkir sebesar 350000");
                total = (harga * jumlah) + (ongkir - 350000);
                System.out.println("Total biaya: " + total);
            } else {
                System.out.println("Anda belum mendapatkan potongan");
                total = harga *jumlah * ongkir;
                System.out.println("Total biaya: Rp." + total);
            }
        }
        System.out.println("Pilih jenis pembayaran");
        System.out.println("1. online");
        System.out.println("2. Tunai");
        pembayaran = input.nextInt();
        if (pembayaran == 1) {
            if (jenis == 1) {
                System.out.println("Anda mendapatkan tambahan potongan sebesar Rp.100000");
                bayar = total - 100000;
                System.out.println("Total pembayaran anda adalah: Rp." + bayar);
            } else if (jenis == 2) {
                System.out.println("Anda mendapatkan tambahan potongan sebesar Rp.200000");
                bayar = total - 200000;
                System.out.println("Total pembayaran anda adalah: Rp." + bayar);
            } else {
                System.out.println("anda mendapatkan tambahan potongan sebesar Rp.50000");
                bayar = total - 50000;
                System.out.println("Total pembayaran anda adalah: Rp" + bayar);
            }
        } else {
            System.out.println("Anda tidak mendapatkan Promo apapun lagi");
            System.out.println("Total pembayaran anda adalah: Rp." + total);
            System.out.println("Silahkan melakukan pembayaran saat mnegkonfirmasi pesanan anda");
        }
    }
}
