package algoritma;

public class nomor4 {

    public static void main(String[] args) {
        int[] nilai = new int[15];
        int genap[]=new int [15];
        int ganjil[]=new int [15];
        int igenap=0,iganjil=0;
        nilai[0] = 1;
        nilai[1] = 2;
        nilai[2] = 3;
        nilai[3] = 4;
        nilai[4] = 5;
        nilai[5] = 6;
        nilai[6] = 7;
        nilai[7] = 8;
        nilai[8] = 9;
        nilai[9] = 10;
        nilai[10] = 11;
        nilai[11] = 12;
        nilai[12] = 13;
        nilai[13] = 14;
        nilai[14] = 15;
        for (int i : nilai) {
            if (i % 2 == 0) {
                genap[igenap]=i;
                igenap++;
            }
            if (i%2==1) {
                ganjil[iganjil]=i;
                iganjil++;
            }
            
        }
        for (int i : genap) {
            if (i==0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i : ganjil) {
            if (i==0) {
                continue;
            }
            System.out.print(i+" ");
        }
    }
    }


