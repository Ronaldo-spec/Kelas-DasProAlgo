package minggu3;

public class nomor1 {

    String namaMhs;
    int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    double rata;

    nomor1() {

    }

    nomor1(String nm, int tgs, int kuis, int uts, int uas) {
        namaMhs = nm;
        nilaiTugas = tgs;
        nilaiKuis = kuis;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }
    void tampil (){
       
        System.out.println("Nilai Tugas: "+nilaiTugas);
        System.out.println("Nilai Kuis: "+nilaiKuis);
        System.out.println("Nilai UTS: "+nilaiUTS);
        System.out.println("Nilai UAS: "+nilaiUAS);
        System.out.println("NILAI AKHIR: "+hitung());
    }
    double hitung (){
       return ((nilaiTugas*30/100)+(nilaiKuis*20/100)+(nilaiUTS*20/100)+(nilaiUAS*30/100));
    }   
}
