
package testsearching;

public class Seacrhing {
    public int[]data;
    public int jumData;
    public Seacrhing(int[]Data, int jmlData){
        this.jumData=jmlData;
        data=new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i]=Data[i];
        }
    }

    Seacrhing(Seacrhing[] array, int elemen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < jumData; j++) {
            if (data[j]==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    public void tampilData(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >=left) {
          mid = (left+right)/2;
            if (cari==data[mid]) {
                return mid;
            } else if (data[mid]>cari){
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    public void tampilPosisi(int x, int pos){
        if (pos!=-1) {
            System.out.println("data: "+x+" ditemukan pada index"+pos);
        } else {
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
   
    public void mergeSort(int[]data,int left,int middle, int right){
            int[]temp=new int [data.length];
            for (int i = left; i < right; i++) {
            temp[i]=data[i];
        }
            int a=left;
            int b=middle+1;
            int c=right;
            while  (a<=middle&&b<=right){
                if (temp[a]<=temp[b]) {
                    data[c]=temp[a];
                    a++;
                } else {
                    data[c]=temp[b];
                    b++;
                }
                c++;
            }
            int s= middle-a;
            for (int i = 0; i <= s; i++) {
            data[c+1]=temp[a+i];
        }
    }
    private void sort (int data[], int left, int right){
        if (left<right) {
            int middle = (left+right)/2;
            mergeSort(data,left,middle,right);
        }
    }
    public void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
  }  
  

