public class RonaldoF_1941720117 {
    public static void main(String args []) {
        double gajiPermenit = 7500;
        double jamKerja = 483*60;
        double paketWifi = (483/2.5)*8000;
        double honor = gajiPermenit*jamKerja;
        double honorWifi = honor-paketWifi;
        double biayaKopi = 50000*20+3;
        double honorKopi = honorWifi-biayaKopi;
        System.out.println("Honor: " + honor);
        System.out.println("Honor setelah bayar wifi: " + honorWifi);
        System.out.println("Honor setelah bayar kopi: " + honorKopi);
    }
}