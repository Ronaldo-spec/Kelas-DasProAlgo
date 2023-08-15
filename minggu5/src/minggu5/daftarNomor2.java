package minggu5;

public class daftarNomor2 {


    nomor2 listClub[] = new nomor2[20];
    int idx;

    void tambah(nomor2 n) {
        if (idx < listClub.length) {
            listClub[idx] = n;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (nomor2 n : listClub) {
            n.tampil();
        }
    }

    void insertionSort(boolean ascending) {
        int i, j;
        for (i = 0; i < listClub.length; i++) {
            nomor2 temp = new nomor2();
            temp = listClub[i];
            j = i;
            if (ascending) {
                while ((j > 0) && (listClub[j - 1].points > temp.points)) {
                    listClub[j] = listClub[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (listClub[j - 1].points < temp.points)) {
                    listClub[j] = listClub[j - 1];
                    j--;
                }
            }
            listClub[j] = temp;
        }
    }
}
