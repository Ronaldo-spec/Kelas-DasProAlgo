package minggu5;
import java.util.Scanner;
public class uts {
Scanner ronaldo = new Scanner(System.in);
    public char[] data;
    public int baris, jumlah, index;
    public void uts(){
        
    }

    public uts(char[] Data) {

        data = new char[18];
        for (int i = 0; i < 18; i++) {

            data[i] = Data[i];
        }

    }

    public void sequential(char cari) {
        for (int j = 0; j < 18; j++) {

            if (data[j]==cari) {
                index = j;
                 System.out.println("Data "+cari+" ditemukan di index ke-"+index);
            }   
        }
    }

  public void tampildata (){
        for (int i = 0; i < 18; i++) {
            System.out.print(data[i]+" ");
        }
   }
  public int FindBinarySearch(char data[],char cari, int left, int right){
        int mid,hasil=0;
        if (right >=left) {
          mid = left+(left-right)/2;
            if (data[mid]==cari) {
               hasil+=1;
                return mid;
            } else if (data[mid]>cari){
                hasil+=1;
                return FindBinarySearch(data,cari, left, mid-1);
            } else {
                hasil+=1;
                return FindBinarySearch(data,cari, mid+1, right);
            }
        }
        
        if (hasil==1) {
            System.out.println("Data ditemukan");
      } else {
            System.out.println("Data tidak ada");
      }
        return -1;
    }
public void selectionSort(char data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j <data.length; j++) {
                if (data[j] < data[idxMin]) {
                    idxMin = j;
                }
            }
            char tmp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = tmp;
        }

    }

}

   
    

    

    

