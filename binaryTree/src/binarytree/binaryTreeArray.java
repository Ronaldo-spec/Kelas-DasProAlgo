
package binarytree;

public class binaryTreeArray {
 int[] data;
    int idxLast;
    public binaryTreeArray(){
        data = new int[10];
    }
    void populateDate(int data[], int idxLast){
        this.data=data;
        this.idxLast=idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }   
}
