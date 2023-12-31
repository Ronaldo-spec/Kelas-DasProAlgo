package minggu5;

public class daftarMahasiswaBerprestasi {
    int jmlMhs;
    mahasiswa listMhs[] = new mahasiswa[jmlMhs];
    int idx;

    void tambah(mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (mahasiswa m : listMhs) {
            m.tampil();

        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    //proses pertukaran:
                    mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            mahasiswa tmp = listMh[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(boolean ascending) {
        int i, j;

        for (i = 1; i < listMhs.length; i++) {
            mahasiswa temp = new mahasiswa();
            temp = listMhs[i];
            j = i;
            if (ascending) {
                while ((j > 0) && (listMhs[j - 1].ipk > temp.ipk)) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            
        }
             else {
                    while ((j > 0) && (listMhs[j - 1].ipk < 0)) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            
        }
            listMhs[j] = temp;
        }

    }
}
