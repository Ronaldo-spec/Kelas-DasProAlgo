
package minggu5;

public class tiket {
    String nama;
    float harga;
    int Tiket;
    static tiket listTiket[]=new tiket[3];

   tiket(){
       
   }
    tiket(String n, int t, float h){
        nama=n;
        Tiket=t;
        harga=h;
    }
    void tampil() {
        System.out.println("Nama: "+nama);
        System.out.println("Banyak tiket: "+Tiket);
    }
    void bubbleSort() {
        for (int i = 0; i < listTiket.length - 1; i++) {
            for (int j = 1; j < listTiket.length - i; j++) {
                if (listTiket[j].harga > listTiket[j - 1].harga) {
                    tiket tmp = listTiket[j];
                    listTiket[j] = listTiket[j - 1];
                    listTiket[j - 1] = tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i = 0; i < listTiket.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listTiket.length; j++) {
                if (listTiket[j].harga < listTiket[idxMin].harga) {
                    idxMin = j;
                }
            }
            tiket tmp = listTiket[idxMin];
            listTiket[idxMin] = listTiket[i];
            listTiket[i] = tmp;
        }
    }
}
