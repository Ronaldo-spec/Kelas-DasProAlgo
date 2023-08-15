
package mergesorttest;

public class mergeSortMain {
    public static void main(String[] args) {
        int data[]={10, 40, 30, 50, 70, 20, 100, 90};
        mergeSort msort=new mergeSort();
        System.out.println("Data Awal");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        msort.printArray(data);
    }
}
